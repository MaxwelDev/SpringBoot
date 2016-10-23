package br.com.sistema.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.sistema.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long>{

}
