package com.jsf.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsf.model.Contato;
import com.jsf.repository.ContatoRepository;

@Controller
@RequestMapping("contatos")
public class ContatoController {
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	@GetMapping("cadastrar")
	public String cadastrar() {
		return "contato/cadastrar";
	}
	
	@GetMapping("exibir")
	public String exibir() {
		return "contato/exibir";
	}
	
	@GetMapping("listar")
	public String listar(Model model) {
		
		List<Contato> contatos = (List<Contato>) contatoRepository.findAll();
		
		model.addAttribute("contatos", contatos);
		
		return "contato/listar";
		
	}

}
