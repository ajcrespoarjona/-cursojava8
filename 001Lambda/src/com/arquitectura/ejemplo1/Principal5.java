package com.arquitectura.ejemplo1;

import java.util.ArrayList;

import com.arquitectura.dominio.Persona;

public class Principal5 {

	public static void main(String[] args) {
		
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		
		listaPersonas.add(new Persona("pedro","gomez",30));
		listaPersonas.add(new Persona("ana","sanchez",40));
		listaPersonas.add(new Persona("gema","blanco",20));
		
		//listaPersonas.sort(new ComparadorNombre());
		
		listaPersonas.sort((p1,p2)->p1.getNombre().compareTo(p2.getNombre()));
		
		for (Persona p: listaPersonas) {
			System.out.printf("persona : %s %s %s %n", p.getNombre(), p.getApellido(), p.getEdad());
		}

	}

}
