import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import br.com.opta2.aula8.domain.Vacina;
import br.com.opta2.aula8.enums.Laboratorio;
import br.com.opta2.aula8.repository.VacinaRepository;

@Service
public class VacinaService {
	@Autowired
	private VacinaRepository vacinaRepository;

	public Vacina save(Vacina vacina) {
		return vacinaRepository.save(vacina);
	}

	public List<Vacina> findAll() {
		return (List<Vacina>) vacinaRepository.findAll();
	}

	public Optional<Vacina> findById(Long id) {
		return vacinaRepository.findById(id);
	}

	public Vacina update(Vacina vacina) {
		return vacinaRepository.save(vacina);
	}

	public void deleteById(Long id) {
		vacinaRepository.deleteById(id);
	}

	public List<Vacina> findByLaboratorio(Laboratorio laboratorio) {
		return (List<Vacina>) vacinaRepository.findByLaboratorio(laboratorio);
	}

	

}
