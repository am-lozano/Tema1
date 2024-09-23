package parte1;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		int aa;
		int an;
		int edad1;
		int edad2;

		// Pedimos el año actual

		System.out.println("Introduzca el año actual:");

		Scanner sc = new Scanner(System.in);

		aa = sc.nextInt();

		// Pedimos el año de nacimiento

		System.out.println("Introduzca su año de nacimiento:");

		an = sc.nextInt();

		// Mostramos la edad del usuario

		edad1 = aa - an;

		edad2 = edad1 + 1;

		System.out.println("Su edad es " + edad1 + " o " + edad2);
		sc.close();

	}

}