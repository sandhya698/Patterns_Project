package com.springproj.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.springproj.DMS.Models.Dog;

/*
 * @author - Sandhya paladugu
 */

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog>findByName(String name);
}
	