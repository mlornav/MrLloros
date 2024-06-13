package com.hospital.MrLloros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.MrLloros.entity.Actor;
import com.hospital.MrLloros.service.ActorService;

@RestController
@RequestMapping("/actor")
public class ActorController {
	@Autowired
	private ActorService actorService;

	@GetMapping("")
	public List<Actor> findAll() {
		return actorService.findAll();
	}

	@PostMapping("/create")
	public void create(@RequestBody Actor a) {
		actorService.create(a);
	}

}
