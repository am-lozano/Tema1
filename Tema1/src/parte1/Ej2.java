package parte1;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Declramos una variable sin valor para pedir el valor por consola

		int num;

		// Pedimos por cconsola el valor de la variable

		System.out.println("Introduzca su edad:");

		// Cambiamos el valor de la variable, sumandole 1 unidad

		num = sc.nextInt() + 1;

		// Mostramos el resultado de la edad

		System.out.println("Su edad el año que viene sera de: " + num);

		sc.close();

	}

}