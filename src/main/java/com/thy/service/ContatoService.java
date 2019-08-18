package com.thy.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thy.model.Contato;
import com.thy.repository.ContatoRepository;

@Service
public class ContatoService {
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	@Transactional
	public void desativar(Contato contato) {
		contato.setAtivo(false);
	}
	
	@Transactional
	public void excluir(Contato contato) {
		contatoRepository.delete(contato);
	}

}
