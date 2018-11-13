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

		Persona persona1 = new Persona("41004940b", "Luke Skywalker", "Jedi");
		Persona persona2 = new Persona("31004940b", "Han Solo", "Cazarrecompensas");
		Persona persona3 = new Persona("54004940b", "Lord Vader", "Sith");
Persona persona4 = new Persona("54004982b", "Darth Maul", "Sith");
		Persona persona5 = new Persona("54344940x", "Maestro Yoda", "Jedi");
		entidades.add(persona1);
		entidades.add(persona2);
		entidades.add(persona3);
		entidades.add(persona4);
		entidades.add(persona5);

		return entidades;

	}

	@RequestMapping(value = { "/coches" }, method = RequestMethod.GET)

	public List<Coche> listarTodosCoches() {

		List<Coche> vehiculos = new ArrayList<>();
		Coche coche1 = new Coche("Modelo: Toledo", "Seat");
		Coche coche2 = new Coche("Modelo: Megane", "Renault");
		Coche coche3 = new Coche("Modelo: Fusion", "Ford");
		Coche coche4 = new Coche("Modelo: Benz", "Mercedes");
		Coche coche5 = new Coche("Modelo: Cooper", "Mini");
		vehiculos.add(coche1);
		vehiculos.add(coche2);
		vehiculos.add(coche3);
		vehiculos.add(coche4);
		vehiculos.add(coche5);

		return vehiculos;
	}

}
