package com.arquitectura.ejemplo2;

import java.util.ArrayList;
import java.util.List;

import com.arquitectura.dominio.Persona;

public class Principal2 {

	public static void main(String[] args) {
		
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		
		listaPersonas.add(new Persona("pedro","gomez",30));
		listaPersonas.add(new Persona("ana","sanchez",40));
		listaPersonas.add(new Persona("gema","blanco",20));
		
		//List<Persona> nuevaLista = buscarPersonaConFiltro(new FiltroPersonaNombre("pedro"), listaPersonas);
		
		//List<Persona> nuevaLista = buscarPersonaConFiltro(new FiltroPersonaApellido("blanco"), listaPersonas);
		
		//List<Persona> nuevaLista = buscarPersonaConFiltro(p->p.getApellido().equals("blanco"),listaPersonas);
		
		List<Persona> nuevaLista = buscarPersonaConFiltro(p->p.getNombre().equals("ana"),listaPersonas);
		
		for (Persona p: nuevaLista) {
			System.out.printf("persona : %s %s %s %n", p.getNombre(), p.getApellido(), p.getEdad());
		}

	}
	
	public static List<Persona> buscarPersonaConFiltro(FiltroPersona filtro, List<Persona> milista) {
		
		List<Persona> listaFiltro  = new ArrayList<Persona>();
		
		for(Persona p: milista) {
			if (filtro.test(p) ) {
				listaFiltro.add(p);
			}
		}
		
		return listaFiltro;
	}
	
	public static List<Persona> buscarPersonaPorApellido(String apellido, List<Persona> milista) {
		
		List<Persona> listaFiltro  = new ArrayList<Persona>();
		
		for(Persona p: milista) {
			if (p.getApellido().equals(apellido) ) {
				listaFiltro.add(p);
			}
		}
		
		return listaFiltro;
	}

}
