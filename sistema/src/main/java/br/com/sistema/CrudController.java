package br.com.sistema;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CrudController {
	
	@RequestMapping("/maxwel")
	@ResponseBody
	public String salvamento() {
		return "<h1>teste</h1>";
	}
	
}
