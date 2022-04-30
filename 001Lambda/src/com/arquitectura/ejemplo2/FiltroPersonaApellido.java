package com.arquitectura.ejemplo2;

import com.arquitectura.dominio.Persona;

public class FiltroPersonaApellido implements FiltroPersona {

	private String apellido;
	
	public FiltroPersonaApellido(String apellido) {
		super();
		this.apellido = apellido;
	}
	
	@Override
	public boolean test(Persona persona) {
		
		if (persona.getApellido().equals(apellido)) {
			return true;
		}else {
			return false;
		}
	}

}
