package br.com.sistema.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.sistema.dao.ProdutoRepository;
import br.com.sistema.model.Produto;

public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public void grava(Produto produto){
		produtoRepository.save(produto);
	}
	
}
