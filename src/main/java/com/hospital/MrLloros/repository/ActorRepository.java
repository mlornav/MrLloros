package com.hospital.MrLloros.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hospital.MrLloros.entity.Actor;

public interface ActorRepository extends CrudRepository<Actor, Integer> {
	List<Actor> findAll();
}
