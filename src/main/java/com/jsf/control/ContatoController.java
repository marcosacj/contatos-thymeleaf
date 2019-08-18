package com.jsf.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("contatos")
public class ContatoController {
	
	@GetMapping("cadastrar")
	public String cadastrar() {
		return "contato/cadastrar";
	}
	
	@GetMapping("exibir")
	public String exibir() {
		return "contato/exibir";
	}
	
	@GetMapping("listar")
	public String listar() {
		return "contato/listar";
	}

}
