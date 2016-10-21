package br.com.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.sistema.model.Produto;

@Controller
public class ProdutoController {

	@RequestMapping(value = "produto")
	public String cadastro(Model model) {

		Produto produto = new Produto();

		produto.setDescricao("bolacha");
		produto.setQuantidade(10);
		produto.setValor(5);

		model.addAttribute("produto", produto);

		return "cadastro";
	}
	
	@RequestMapping(value="exibe")
	@ResponseBody
	public String gravar(Produto produto){
		
		System.out.println(produto.getDescricao());
		System.out.println(produto.getQuantidade());
		System.out.println(produto.getValor());
		
		return "<h1>gravado com sucesso!</h1>";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
