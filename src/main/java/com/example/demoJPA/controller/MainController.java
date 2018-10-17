package com.example.demoJPA.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoJPA.entity.Coche;
import com.example.demoJPA.entity.Persona;

@RestController

public class MainController {

	@RequestMapping(value = { "/personas" }, method = RequestMethod.GET)

	public List<Persona> listarTodos() {

		List<Persona> entidades = new ArrayList<>();

		Persona persona1 = new Persona("41004940b", "Spiderman", "random");
		Persona persona2 = new Persona("31004940b", "Superman", "random");
		Persona persona3 = new Persona("54004940b", "Antman", "random");

		entidades.add(persona1);
		entidades.add(persona2);
		entidades.add(persona3);

		return entidades;

	}

	@RequestMapping(value = { "/coches" }, method = RequestMethod.GET)

	public List<Coche> listarTodosCoches() {

		List<Coche> vehiculos = new ArrayList<>();
		Coche coche1 = new Coche("xxxx", "Seat");
		Coche coche2 = new Coche("fddffd", "Renault");
		Coche coche3 = new Coche("sdsdd", "Ford");
		vehiculos.add(coche1);
		vehiculos.add(coche2);
		vehiculos.add(coche3);

		return vehiculos;
	}

}
