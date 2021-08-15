package br.com.opta2.aula8.resources;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.opta2.aula8.domain.Vacina;
import br.com.opta2.aula8.enums.Laboratorio;
import br.com.opta2.aula8.service.VacinaService;

@RestController
@RequestMapping("/api/v1/vacinas")

public class VacinaResource {
	@Autowired
	private VacinaService vacinaService;

	@PostMapping
	public Vacina save(@RequestBody Vacina vacina) {
		return vacinaService.save(vacina);
	}


	@GetMapping
	public List<Vacina> findAll() {
		return vacinaService.findAll();
	}


	@GetMapping(path = {"/{id}"})
	public ResponseEntity<?> findById(@PathVariable Long id){
	return vacinaService.findById(id)
	.map(record -> ResponseEntity.ok().body(record))
	.orElse(ResponseEntity.notFound().build());
	}

	@PutMapping(value = "/{id}")
	public Vacina update(@PathVariable("id") Long id, @RequestBody Vacina vacina) {
		Optional<Vacina> optional = vacinaService.findById(id);
		if (optional.isPresent()) {
			Vacina v = optional.get();
			v.setNome(vacina.getNome());
			v.setCpf(vacina.getCpf());
			v.setCidade(vacina.getCidade());
			v.setLaboratorio(vacina.getLaboratorio());
			v.setNomeResponsavel(vacina.getNomeResponsavel());
			v.setDataaplica(vacina.getDataaplica());
			v.setDataSegunda(vacina.getDataSegunda());
			vacinaService.update(v);
			return v;
		} else {
			throw new RuntimeException("Não foi possível alterar registro");
		}
	}

	@DeleteMapping(path = { "/{id}" })
	public void delete(@PathVariable("id") Long id) {
		vacinaService.deleteById(id);
	}

}
