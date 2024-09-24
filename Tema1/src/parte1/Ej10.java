package parte1;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {

		/*
		 * Escribir un programa que pida un número al usuario e indique mediante un
		 * literal booleano (true o false) si el número es par.
		 */

		// Declaramos las variables necesarias

		double num;

		// Variable que devuelve true o false según la condición que pongamos

		boolean par;

		// Pedimos el numero por consola

		System.out.println("Introduzca un número:");

		Scanner n = new Scanner(System.in);

		num = n.nextDouble();

		// Comprobamos si el numero es par y mostrara true si es par o false si es impar

		par = (num % 2 == 0);

		System.out.println(par);

		n.close();

	}

}
