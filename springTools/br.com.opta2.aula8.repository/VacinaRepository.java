package br.com.opta2.aula8.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.opta2.aula8.domain.Vacina;
import br.com.opta2.aula8.enums.Laboratorio;

@Repository
public interface VacinaRepository extends CrudRepository<Vacina, Long>{
	List<Vacina> findByLaboratorio(Laboratorio laboratorio);

}
