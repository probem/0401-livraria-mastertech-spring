package br.com.groger.livraria.repository;

import br.com.groger.livraria.model.livrariaModel;
import org.springframework.data.repository.CrudRepository;

public interface livrariaRepository extends CrudRepository<livrariaModel, String> {
}
