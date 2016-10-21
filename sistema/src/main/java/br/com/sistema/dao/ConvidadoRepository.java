package br.com.sistema.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.sistema.model.Convidado;

public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {

}
