package com.hospital.MrLloros.entity;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;

@Entity
public class Medico extends Actor {

	@NonNull
	private String especialidad;

	public Medico() {
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
}
