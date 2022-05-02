package com.arquitectura.ejemplo3;

import com.arquitectura.dominio.Persona;

public interface FiltroPersona {
	
	public boolean test (Persona persona);
	
	default public FiltroPersona or (FiltroPersona filtro) {
		
		return (Persona p) -> {return test(p) || filtro.test(p);};
	}

}
