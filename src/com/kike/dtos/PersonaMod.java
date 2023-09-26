package com.kike.dtos;

public class PersonaMod {
	
	private String nombre;
	private Integer edad;
	private String edadString;
	
	public PersonaMod(String nombre, String edadString) {
		
		if(nombre.isEmpty()) {
			this.nombre = null;
		}
		else {
			this.nombre = nombre;
		}
		
		if(edadString.isEmpty()) {
			this.edadString = null;
		}
		else {
			this.edad = Integer.parseInt(edadString);
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
