package com.arquitectura.dominio;

public class Persona implements Comparable<Persona>{
	
	private String nombre;
	private String apellido;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellidos;
		this.edad = edad;
	}
	@Override
	public int compareTo(Persona otro) {
		
		return this.getNombre().compareTo(otro.getNombre());
	}
	
	public boolean estaJubilado() {
		return this.getEdad()>65;
	}
	
	

}
