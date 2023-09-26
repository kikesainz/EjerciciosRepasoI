package com.kike.menus;

import com.kike.ejercicios.Ejercicios;

public class HolaMundo implements IAccionMenu{

	@Override
	public void ejecutar(Ejercicios e) {
		
		e.holaMundo();
		
	}

	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return "Hola mundo \\n";
	}

}
