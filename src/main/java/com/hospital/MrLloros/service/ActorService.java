package com.hospital.MrLloros.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.MrLloros.entity.Actor;
import com.hospital.MrLloros.repository.ActorRepository;

@Service
public class ActorService {
	@Autowired
	private ActorRepository actorRepository;
	
	public List<Actor> findAll() {
		return actorRepository.findAll();
	}
	
	public void create(Actor a) {
//		Actor actor = new Actor();
//		actor.setApellidos(a.getApellidos());
//		actor.setCorreoElectronico(a.getCorreoElectronico());
		actorRepository.save(a);
	}

}
