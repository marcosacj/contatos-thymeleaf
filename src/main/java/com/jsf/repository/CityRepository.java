package com.jsf.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jsf.model.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}