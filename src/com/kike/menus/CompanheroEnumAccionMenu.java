package com.kike.menus;

import com.kike.ejercicios.Ejercicios;

public class CompanheroEnumAccionMenu implements IAccionMenu{

	@Override
	public void ejecutar(Ejercicios e) {
		
		e.sacarNombreEnum();
		
	}

	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return "Elegir compañero ENUM \n";
	}

}