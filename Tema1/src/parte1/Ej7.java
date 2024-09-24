package parte1;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {

		/*
		 * Escribir un programa que le pida al usuario su nombre, dirección y teléfono.
		 * Guarda cada dato en variables distintas. A continuación, muestra los datos de
		 * la siguiente forma:
		 * Nombre: Elena
		 * Dirección: Calle Inventada
		 * Teléfono: 987654321
		 */

		//Declaramos las variables necesarias
		
		String nombre;
		String direccion;
		int movil;
		
		//Pedimos los datos por consola
		
		System.out.println("Introduzca su nombre:");
		
		Scanner n = new Scanner (System.in);
		
		nombre = n.nextLine(); 
		
		System.out.println("Introduzca su dirección:");
		
		Scanner d = new Scanner (System.in);
		
		direccion = d.next();
		
		System.out.println("Introduzca su número de teléfono:");
		
		Scanner m = new Scanner (System.in);
		
		movil =m.nextInt();
				
		//Mostramos los resultados
				
		System.out.println("Nombre: " + nombre);
		System.out.println("Nombre: " + direccion);
		System.out.println("Nombre: " + movil);
		
		n.close();
		d.close();
		m.close();
	}
}
