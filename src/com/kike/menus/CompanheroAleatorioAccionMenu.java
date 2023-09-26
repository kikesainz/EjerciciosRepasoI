package com.kike.menus;

import com.kike.ejercicios.Ejercicios;

public class CompanheroAleatorioAccionMenu  implements IAccionMenu{

	@Override
	public void ejecutar(Ejercicios e) {
		
		e.sacarNombre();
		
	}

	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return "Elegir compañero aleatorios \n";
	}

}