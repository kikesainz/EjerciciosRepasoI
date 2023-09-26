package com.kike.menus;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kike.ejercicios.Ejercicios;

public class Menu {

	/**
	 * Comentar los métodos que no se quieran probar
	 */
	public Menu() {
		Ejercicios ejercicios = new Ejercicios();
		Scanner sc = new Scanner(System.in);
		
        System.out.println("""
                Elija el programa que desea ejecutar:\n
                 1.- Hola mundo \n
                 2.- Número aleatorio entre 1 - 10 \n
                 3.- Elegir compañero aleatorios \n
                 4.- Elegir compañero ENUM\n
                 5.- Generar 20 números aleatorios y comparar\n
                 6.- Piedra, papel, tijera.\n
                 7.- Números primos del 1 al 100 \n
                 8.- Comparar palabras \n
                 9.- Cara o Cruz \n
                 10.- Fibonacci \n
                 11.- Salir \n
                
                 """);
        Integer num = sc.nextInt();
        
        switch (num) {
        case 1 -> ejercicios.holaMundo();
        case 2 -> ejercicios.numAleatorio();
        case 3 -> ejercicios.numAleatorioComparador();
        case 4 -> ejercicios.sacarNombre();
        case 5 -> ejercicios.sacarNombreEnum();
        case 6 -> ejercicios.piedraPapelTijera();
        case 7 -> ejercicios.numerosPrimos();
        case 8 -> ejercicios.compararPalabras();
        case 9 -> ejercicios.lanzarMoneda();
        case 10 -> ejercicios.fibonacci();
        case 11 -> System.exit (0);

    }

}

//		System.out.println("[Ejercicio 1]");
//		ejercicios.holaMundo();
//		
//		System.out.println("\n[Ejercicio 2]");
//		System.out.println(ejercicios.numAleatorio());
//		
//		System.out.println("\n[Ejercicio 3]");
//		System.out.println(ejercicios.sacarNombre());
//		
//		System.out.println("\n[Ejercicio 4]");
//		System.out.println(ejercicios.sacarNombreEnum());
//		
//		System.out.println("\n[Ejercicio 5]");
//		ejercicios.numAleatorioComparador();
//		
//		System.out.println("\n[Ejercicio 6]");
//		ejercicios.piedraPapelTijera();
//		
//		System.out.println("\n[Ejercicio 7]");
//		ejercicios.numerosPrimos();
//		
//		System.out.println("\n[Ejercicio 8]");
//		ejercicios.compararPalabras();
//		
//		System.out.println("\n[Ejercicio 9]");
//		ejercicios.lanzarMoneda();
//		
//		System.out.println("\n[Ejercicio 10]");
//		ejercicios.fibonacci();
//		
//		System.out.println("\n[Ejercicio 11]");
//		ejercicios.anadePersona();
//		ejercicios.anadePersona();
//		ejercicios.muestraListaPersonas();
//		
//		System.out.println("\n[Ejercicio 12]");
//		ejercicios.anadePersonaMod();
//		ejercicios.anadePersonaMod();
//		ejercicios.muestraListaPersonasMod();
//		
//		System.out.println("\n[Ejercicio 13] -> Proyecto ejercicioBanco");
//		System.out.println("\n[Ejercicio 14] -> Proyecto ejercicioEmpresa");
//		System.out.println("\n[Ejercicio 15] -> Proyecto ejercicioUtilidades");
	
}
