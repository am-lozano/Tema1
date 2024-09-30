package parte1;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {

		/*
		 * Escribir un programa que solicite las notas del primer, segundo y tercer
		 * trimestre (notas enteras que se solicitarán al usuario). El programa debe
		 * mostrar la nota media del curso como se utiliza en el boletín de
		 * calificaciones (solo la parte entera) y como se usa en el expediente
		 * académico (con decimales).
		 */
		
		// Declaramos las variables

		int nota1;
		int nota2;
		int nota3;
		int boletin;
		double expediente;
		
		
		//Pedimos los datos necesarios

		System.out.println("Introduzca su nota, sin decimales\n");

		Scanner sc = new Scanner(System.in);

		System.out.println("Primer trimestre:");

		nota1 = sc.nextInt();

		System.out.println("Segundo trimestre:");

		nota2 = sc.nextInt();

		System.out.println("Tercer trimestre:");

		nota3 = sc.nextInt();
		
		//Hacemos las operaciones para la media en los 2 casos
		
		boletin = ((nota1 + nota2 + nota3) / 3);
		
		expediente = ((nota1 + nota2 + nota3) / 3);

		/*
		 * Para redondear a las unidades
		 * long redondeado = Math.round(expediente);
		 */
		
		//Mostramos los resultados
		
		System.out.println("Su nota media del boletin es: " + boletin);
		System.out.println("Su nota media del boletin es: " + expediente);
		
		sc.close();

	}

}
