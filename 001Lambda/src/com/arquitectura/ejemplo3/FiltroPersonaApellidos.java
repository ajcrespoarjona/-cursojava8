package com.arquitectura.ejemplo3;

import com.arquitectura.dominio.Persona;

public class FiltroPersonaApellidos implements FiltroPersona {

	private String apellido;
	
	public FiltroPersonaApellidos(String apellido) {
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
