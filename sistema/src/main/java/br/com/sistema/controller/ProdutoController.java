package br.com.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.sistema.model.Produto;
import br.com.sistema.service.ProdutoService;

@Controller
public class ProdutoController {
	
	@RequestMapping("/cadastrar")
	public String Cadastrar(Produto produto){
		return "cadastrar";
	}

	@RequestMapping(value="salvaProduto")
	@ResponseBody
	public String gravar(Produto produto){
		System.out.println(produto.getDescricao());
		System.out.println(produto.getCodBarras());
		System.out.println(produto.getValor());
		ProdutoService produtoService = new ProdutoService();
		
		//produtoService.grava(produto);
		return "<h1>gravado com sucesso!</h1>";
	}

}
