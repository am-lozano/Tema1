package parte1;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		/*
		 * Declaramos las variables y pedimos el valor de las notas Usamos "double" ya
		 * que la nota y la media puede tener decimales
		 */

		double n1;
		double n2;
		double media;

		System.out.println("En caso de que su nota tenga decimales utilize , y no .");
		
		//Pedimos la primera nota

		System.out.println("Introduzca su primera nota:");

		Scanner sc = new Scanner(System.in);

		n1 = sc.nextDouble();

		// Pedimos la segunda nota

		System.out.println("Iintroduzca su segunda nota:");

		n2 = sc.nextDouble();

		// Declaramos el valor de la variable media

		media = (n1 + n2) / 2;

		// Mostramos la media de las notas introducidas

		System.out.println("Su media es de: " + media);

		sc.close();

	}
}
