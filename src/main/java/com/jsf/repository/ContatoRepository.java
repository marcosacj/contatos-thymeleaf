package com.jsf.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jsf.model.Contato;

@Repository
public interface ContatoRepository extends CrudRepository<Contato, Long> {
	
}
