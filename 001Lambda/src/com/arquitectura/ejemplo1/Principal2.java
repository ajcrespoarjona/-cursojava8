package com.arquitectura.ejemplo1;

import java.util.ArrayList;

import com.arquitectura.dominio.Persona;
import com.arquitectura.ejemplo1.comparadores.ComparadorApellidos;

public class Principal2 {

	public static void main(String[] args) {
		
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		
		listaPersonas.add(new Persona("pedro","gomez",30));
		listaPersonas.add(new Persona("ana","sanchez",40));
		listaPersonas.add(new Persona("gema","blanco",20));
		
		//listaPersonas.sort(new ComparadorNombre());
		
		listaPersonas.sort(new ComparadorApellidos());
		
		for (Persona p: listaPersonas) {
			System.out.printf("persona : %s %s %s %n", p.getNombre(), p.getApellido(), p.getEdad());
		}

	}

}
