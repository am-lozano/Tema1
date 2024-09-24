package parte1;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {

		/*
		 * Realizar una aplicación que solicite al usuario su edad y le indique si es
		 * mayor de edad (mediante un literal booleano: true o false).
		 */

		// Declaramos las variables

		int edad;

		// Declaramos una variable que nos devuelva true o false

		boolean mayoromenor;

		// Pedimos por consola la edad

		System.out.println("Introduzca su edad:");

		// Escaner para pedir la edad

		Scanner e = new Scanner(System.in);

		edad = e.nextInt();

		// Comprobamos si la edad introducida es mayor o menor a 18 y mostramos el
		// resultado

		mayoromenor = (edad >= 18);

		System.out.println(mayoromenor);

		e.close();

	}
}
