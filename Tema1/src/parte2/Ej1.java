package parte2;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		/*
		 * Realizar un programa que pida como entrada un número con decimales y lo
		 * muestre redondeado al entero más próximo. (SIN UTILIZAR Math.round())
		 */

		//Decalramos las variables
		
		double num;
		
		//Pedimos el número
		
		System.out.println("Introduzca un número con decimales:");
		
		Scanner n = new Scanner (System.in);
		
		//Registramos el número introducido por consola y le sumamos 0,5
		
		num = n.nextDouble() + 0.5;
		
		System.out.println(num);
		
		//Nos quedamos con la parte entera del número
		
		n.close();
	}

}
