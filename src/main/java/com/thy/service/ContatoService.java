package com.thy.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.thy.model.Contato;

@Service
public class ContatoService {
	
	@Transactional
	public void desativar(Contato contato) {
		contato.setAtivo(false);
	}

}
