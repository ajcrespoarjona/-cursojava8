package com.arquitectura.ejemplo1.comparadores;

import java.util.Comparator;

import com.arquitectura.dominio.Persona;

public class ComparadorApellidos implements Comparator<Persona> {

	@Override
	public int compare(Persona persona1, Persona persona2) {
		
		return persona1.getApellido().compareTo(persona2.getApellido());
	}

}
