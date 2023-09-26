package com.kike.menus;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kike.ejercicios.Ejercicios;

public class Menu {

	public Menu() {
		Ejercicios ejercicios = new Ejercicios();
		
		List<IAccionMenu> acciones = new RellenadorMenu().rellenaMenu();
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("\nMenú:");
			for (int i = 0; i < acciones.size(); i++) {
				System.out.println((i + 1) + ". " + acciones.get(i).getTitulo());
			}

			System.out.print("Elige una opción: ");
			int eleccion = scanner.nextInt();

			if (eleccion > 0 && eleccion <= acciones.size()) {
				acciones.get(eleccion - 1).ejecutar(ejercicios);
			} else {
				System.out.println("Opción no válida. Por favor, elige nuevamente.");
			}
		}

	}
}
