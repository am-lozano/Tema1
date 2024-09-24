package parte1;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que pida al usuario su nombre y su edad y muestre por
		 * pantalla un mensaje como el siguiente: “Hola Juanito, tienes 21 años, ¡qué
		 * mayor eres!”.
		 */

		// Declaramos las variables

		String nombre;
		int edad;

		// Pedimos los datos por consola

		// Scanner para pedir el nombre

		System.out.println("Introduzca su nombre:");

		Scanner n = new Scanner(System.in);

		nombre = n.nextLine();

		// Scanner para pedir la edad

		System.out.println("Introduzca su edad:");

		Scanner e = new Scanner(System.in);

		edad = e.nextInt();
		
		//Mostramos los resultados
		
		System.out.println("Hola " + nombre + " tienes " + edad + "años, ¡qué mayor eres!");
		
		n.close();
		e.close();

	}

}
