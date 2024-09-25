package parte1;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {

		/*
		 * Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen
		 * aspectos que influirán en esta decisión: solo podremos salir a la calle si no
		 * está lloviendo y hemos finalizado nuestras tareas. Existe una opción en la
		 * que, indistintamente de lo anterior, podremos salir a la calle: el hecho de
		 * tener que ir a la biblioteca. Solicitar al usuario (mediante un booleano) si
		 * llueve, si ha finalizado las tareas y si necesita ir a la biblioteca. El
		 * algoritmo debe mostrar mediante un booleano (true o false) si es posible que
		 * se le otorgue permiso para salir a la calle.
		 * 
		 */

		// Declaramos las variables

		boolean lluvia;
		boolean tareas;
		boolean biblio;

		// Pegruntamos las condiciones para salir a la calle

		System.out.println("¿Esta lloviendo?");
		
		Scanner duda = new Scanner (System.in);
		
		lluvia = duda.nextBoolean();
		
		System.out.println("¿Tareas realizadas?");
		
		Scanner duda = new Scanner (System.in);
		
		tarea = duda.nextBoolean();
		
		System.out.println("¿Vas a ir a la biblioteca?");
		
		Scanner duda = new Scanner (System.in);

		biblio = duda.nextBoolean();
		
	}
}
