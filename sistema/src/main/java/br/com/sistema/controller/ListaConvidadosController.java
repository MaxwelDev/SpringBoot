package br.com.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.sistema.dao.ConvidadoRepository;
import br.com.sistema.model.Convidado;


@Controller
public class ListaConvidadosController {

	@Autowired
	private ConvidadoRepository convidadoRepository;
	
	@RequestMapping("listaconvidados")
	public String listaConvidados(Model model){
		
		Convidado convidado = new Convidado();
		convidado.setNome("Maxwel");
		convidado.setEmail("maxwel");
		convidado.setTelefone("25585304");
		convidado.setId(11L);

		model.addAttribute("convidados", convidado);
		return "listaConvidados";
	}

}
