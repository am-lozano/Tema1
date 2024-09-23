package parte1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		// Declaramos una variable sin valor para pedir el valor por consola

		int num;

		Scanner sc = new Scanner(System.in);

		// Pedimos por consola el valor de la variable

		System.out.println("Introduzca un número entero:");

		num = sc.nextInt();

		// Mostramos el resultado

		System.out.println("Su número elegido es " + num);

		sc.close();

	}
}