package com.kike.ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.kike.dtos.Persona;
import com.kike.dtos.PersonaMod;

public class Ejercicios {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	static List<PersonaMod> listaPersonasMod = new ArrayList<>();
	static List<Persona> listaPersonas = new ArrayList<>();

	public void holaMundo() {
		System.out.println("Hola Mundo");
	}

	public int numAleatorio() {
		return rand.nextInt(11);
	}

	public String sacarNombre() {
		String[] array = { "Rubén", "Diego", "Klabitos", "Fadón", "Javier", "Pablet", "Raúl", "Manuel", "Sonia",
				"Sergio", "Fernando", "José", "Jorge" };
		return array[rand.nextInt(array.length)];
	}

	public enum Companeros {
		RUBEN, DIEGO, KLABITOS, FADON, JAVIER, PABLET, RAUL, MANUEL, SONIA, SERGIO, FERNANDO, JOSE, JORGE;

	}

	public Companeros sacarNombreEnum() {
		Companeros[] nombres = Companeros.values();
		return nombres[rand.nextInt(nombres.length)];
	}

	public void numAleatorioComparador() {
		int primerNum = rand.nextInt(11);

		for (int i = 1; i <= 20; i++) {
			int segundoNum = rand.nextInt(11);

			if (primerNum == segundoNum) {
				System.out.println("(" + i + ")" + " El primer número " + primerNum + " es igual que " + segundoNum);
			} else if (primerNum > segundoNum) {
				System.out.println("(" + i + ")" + " El primer número " + primerNum + " es mayor que " + segundoNum);
			} else {
				System.out.println("(" + i + ")" + " El primer número " + primerNum + " es menor que " + segundoNum);
			}
		}
	}

	public void piedraPapelTijera() {
		String respuestaIA = null;
		String respuestaUser = null;

		do {
			System.out.print("==>Juego piedra, papel o tijera<==" + "\n1-Piedra" + "\n2-Papel" + "\n3-Tijera"
					+ "\nSeleccione una opción: ");
			respuestaUser = seleccionarOpcionPPT(Integer.parseInt(sc.nextLine()));

			if (respuestaUser != "Piedra" && respuestaUser != "Papel" && respuestaUser != "Tijera") {
				System.err.println("Seleccione una opción del menú");
				continue;
			}

			System.out.println("-> Has seleccionado " + respuestaUser);

			respuestaIA = seleccionarOpcionPPT(rand.nextInt(3) + 1);
			System.out.println("-> La IA ha escogido " + respuestaIA);
		} while (respuestaUser.equals("(!) Error de selección"));

		if ((respuestaUser.equals("Piedra") && (respuestaIA.equals("Tijera")))) {
			System.out.println("¡Has ganado! La Piedra gana a la Tijera");
		} else if (respuestaUser.equals(respuestaIA)) {
			System.out.println("Has empatado, has seleccionado lo mismo que la IA");
		} else if ((respuestaUser.equals("Tijera") && (respuestaIA.equals("Piedra")))) {
			System.out.println("Has perdido, la Tijera pierde contra la Piedra");
		} else if ((respuestaUser.equals("Piedra") && (respuestaIA.equals("Papel")))) {
			System.out.println("Has perdido, la Piedra pierde contra el Papel");
		} else if ((respuestaUser.equals("Tijera") && (respuestaIA.equals("Papel")))) {
			System.out.println("¡Has ganado! La Tijera gana contra el Papel");
		} else if ((respuestaUser.equals("Papel") && (respuestaIA.equals("Piedra")))) {
			System.out.println("¡Has ganado! El Papel gana contra la Piedra");
		} else if ((respuestaUser.equals("Papel") && (respuestaIA.equals("Tijera")))) {
			System.out.println("Has perdido, el papel pierde contra la tijera");
		}
	}

	/**
	 * @param ia
	 * @return
	 */
	private String seleccionarOpcionPPT(int opc) {
		String opcion;
		switch (opc) {
		case 1:
			opcion = "Piedra";
			break;
		case 2:
			opcion = "Papel";
			break;
		case 3:
			opcion = "Tijera";
			break;
		default:
			opcion = "(!) Error de selección";
			break;
		}
		return opcion;
	}

	public void numerosPrimos() {
		for (int i = 1; i <= 100; i++) {
			int cont = 0;

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cont++;
				}
			}

			if (cont == 2) {
				System.out.println(i + " -> PRIMO");
			} else {
				System.out.println(i);
				cont = 0;
			}
		}
	}

	public void compararPalabras() {
		System.out.print("Introduce la palabra a comparar: ");
		String palabra1 = sc.nextLine();

		System.out.print("Introduce la segunda palabra: ");
		String palabra2 = sc.nextLine();

		if (palabra1.equalsIgnoreCase(palabra2)) {
			System.out.println("Las palabras son iguales");
		} else {
			System.out.println("Las palabras son diferentes");
		}
	}

	public void lanzarMoneda() {
		int cont = 0;

		while (cont <= 1000000) {
			int moneda = rand.nextInt(2) + 1;

			System.out.print("(" + cont + ") ");
			switch (moneda) {
			case 1:
				System.out.println("Ha salido CARA");
				break;

			case 2:
				System.out.println("Ha salido CRUZ");
				break;
			default:
				System.out.println("Ha salido ERROR");
				break;
			}
			cont++;
		}
	}

	public void fibonacci() {
		int suma;
		int valorA;
		int valorB = 0;

		System.out.print("Introduce un número: ");
		valorA = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < 10; i++) {
			suma = valorA + valorB;
			valorA = valorB;
			valorB = suma;

			System.out.println(suma + " ");
		}
	}

	public void anadePersonaMod() {
		System.out.print("Introduce el nombre: ");
		String nombre = sc.nextLine();

		System.out.print("Introduce la edad: ");
		String edadString = sc.nextLine();

		PersonaMod p = new PersonaMod(nombre, edadString);
		listaPersonasMod.add(p);
	}

	public void anadePersona() {
		System.out.print("Introduce el nombre: ");
		String nombre = sc.nextLine();

		System.out.print("Introduce la edad: ");
		int edad = Integer.parseInt(sc.nextLine());

		Persona p = new Persona(nombre, edad);
		listaPersonas.add(p);
	}

	public void muestraListaPersonasMod() {
		Iterator<PersonaMod> i = listaPersonasMod.iterator();

		while (i.hasNext()) {
			PersonaMod p = i.next();
			System.out.println(p.toString());
		}
	}

	public  void muestraListaPersonas() {
		Iterator<Persona> i = listaPersonas.iterator();

		while (i.hasNext()) {
			Persona p = i.next();
			System.out.println(p.toString());
		}
	}
}
