package com.thy.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.thy.model.Contato;
import com.thy.repository.ContatoRepository;
import com.thy.service.ContatoService;

@Controller
@RequestMapping("contatos")
public class ContatoController {
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	@Autowired
	private ContatoService contatoService;
	
	@GetMapping("cadastrar")
	public String cadastrar(Model model) {
		
		Contato contato = new Contato();
		
		model.addAttribute("contato", contato);
		
		return "contato/cadastrar";
		
	}
	
	@GetMapping("listar")
	public String listar(Model model) {
		
		List<Contato> contatos = (List<Contato>) contatoRepository.findAll();
		
		model.addAttribute("contatos", contatos);
		
		return "contato/listar";
		
	}
	
	@PostMapping("novo")
	public String novo( @ModelAttribute Contato contato ) {
		
		contatoRepository.save(contato);
		
		return "redirect:listar";
		
	}
	
	@GetMapping("editar/{id}")
	public ModelAndView editar(@PathVariable Integer id) {
		
		ModelAndView mv = new ModelAndView("contato/cadastrar");
		
		Contato contato = contatoRepository.findById(id);
		
		mv.addObject("contato", contato);
		
		return mv;
		
	}
	
	@GetMapping("desativar/{id}")
	public String desativar(@PathVariable Integer id) {
		
		Contato contato = contatoRepository.findById(id);
		
		contatoService.desativar(contato);
		
		return "redirect:/contatos/listar";
		
	}
	

	
	@GetMapping("excluir/{id}")
	public String excluir(@PathVariable Integer id) {
		
		Contato contato = contatoRepository.findById(id);
		
		contatoService.excluir(contato);
		
		return "redirect:/contatos/listar";
		
	}

}
