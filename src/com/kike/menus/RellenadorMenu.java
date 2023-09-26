package com.kike.menus;

import java.util.ArrayList;
import java.util.List;

public class RellenadorMenu {

	public List<IAccionMenu> rellenaMenu() {
		List<IAccionMenu> acciones = new ArrayList<>();
		// Agregar las acciones al menú
		acciones.add(new HolaMundoAccionMenu());
		acciones.add(new NumeroAleatorioAccionMenu());
		acciones.add(new CompanheroAleatorioAccionMenu());
		acciones.add(new CompanheroEnumAccionMenu());
		return acciones;
	}

}
