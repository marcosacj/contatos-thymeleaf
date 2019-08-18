package com.jsf.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jsf.model.Contato;

@Repository
public interface ContatoRepository extends CrudRepository<Contato, Long> {
	
	@Query("SELECT c FROM Contato c WHERE c.id = ?1")
	public Contato findById(Integer id);
	
}
