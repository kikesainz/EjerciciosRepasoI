package com.kike.menus;

import com.kike.ejercicios.Ejercicios;

public class NumeroAleatorioAccionMenu  implements IAccionMenu{

	@Override
	public void ejecutar(Ejercicios e) {
		
		e.numAleatorio();
		
	}

	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return "Número aleatorio entre 1 - 10 \n";
	}

}
