package parte2;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {

		/*
		 * Una empresa que gestiona un parque acuático te solicita una aplicación que
		 * les ayude a calcular el importe que hay que cobrar en la taquilla por la
		 * compra de una serie de entradas (cuyo número será introducido por el
		 * usuario). Existen dos tipos de entradas: infantiles, que cuestan 15,50€; y de
		 * adultos, que cuestan 20€. En el caso de que el importe total sea igual o
		 * superior a 100€, se aplicará automáticamente un bono descuento del 5%.
		 */

		// Variable para el numero de entradas infantiles
		int infantiles;

		// Variable para el numero de entradas adultos
		int adultos;

		// Variable para calcular el importe total a pagar por las entradas
		double total;

		// Constante para el precio de infantiles
		final double PRECIO_INFANTILES;

		// Constante para el precio de adultos
		final double PRECIO_ADULTOS;

		// Constante para el porcentaje del descuento
		final double PORCENTAJE = 0.05;

		// Variable para saber si hay que aplicar descuento al precio total
		boolean descuento;

		// Creamos el escanner
		Scanner sc = new Scanner(System.in);

		// Pedimos el numero de entradas infantiles y de adultos

		System.out.println("Introduzca el numero de entradas infantiles");
		infantiles = sc.nextInt();

		System.out.println("Introduzca el numero de entradas adultas");
		adultos = sc.nextInt();

		// Calculamos el precio de la entrada

		PRECIO_INFANTILES = infantiles * 15.50;
		PRECIO_ADULTOS = adultos * 20;

		// Calculamos el precio total sin descuento a pagar
		total = PRECIO_INFANTILES + PRECIO_ADULTOS;

		// Mostramos los resultados
		System.out.println("Su precio inicial es de: " + total + " €, \n pero aplicandole descuento se queda en:"
				+ (total > 100 ? total - (total * PORCENTAJE) : total) + " €");

		// Cerramos el escaner
		sc.close();

	}

}
