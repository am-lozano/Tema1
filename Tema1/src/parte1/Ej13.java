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
		boolean tarea;
		boolean biblio;
		
		System.out.println("Responda con true, en caso afirmativo, y con false, en caso negativo, a las siguientes preguntas:\n");

		// Pegruntamos las condiciones para salir a la calle

		System.out.println("¿Esta lloviendo?");

		Scanner sc = new Scanner(System.in);

		lluvia = sc.nextBoolean();

		System.out.println("¿Tareas realizadas?");

		tarea = sc.nextBoolean();

		System.out.println("¿Vas a ir a la biblioteca?");

		biblio = sc.nextBoolean();
		
		//Hacemos la comparacion para saber si se puede o no salir a la calle

		System.out.println(!lluvia && tarea || biblio ? "Si puedes salir" : "No puedes salir");

		sc.close();
		
	}
}
