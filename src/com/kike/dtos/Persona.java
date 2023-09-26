package com.kike.dtos;

public class Persona {

	private String nombre;
	private Integer edad;

	public Persona(String nombre, Integer edad) {
		
		if(nombre.isEmpty()) {
			this.nombre = "Anónimo";
		}
		else {
			this.nombre = nombre;
		}
		
		if(edad <= 0) {
			this.edad = -99;
		}
		else {
			this.edad = edad;
		}
		
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
