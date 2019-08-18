package com.jsf.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.jsf.model.Contato;

@Service
public class ContatoService {
	
	@Transactional
	public void desativar(Contato contato) {
		contato.setAtivo(false);
	}

}
