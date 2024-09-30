package parte1;

import java.util.Scanner;

public class EJ12 {

	public static void main(String[] args) {

		/*
		 * Un frutero necesita calcular los beneficios anuales que obtiene de la venta
		 * de manzanas y peras. Por este motivo, es necesario diseñar una aplicación que
		 * solicite las ventas (en kilos, tanto de las peras como de las manzanas). La
		 * aplicación mostrará el importe total sabiendo que el precio del kilo de
		 * manzanas está fijado en 2,35€ y el kilo de peras en 1,95€.
		 */

		// Decalramos las variables necesarias

		// Usamos doubles ya que los kg pueden no ser exactos

		double manzanas;
		double peras;

		/*
		 * Declaramos el precio de las manzanas y peras como constante ya que no va a
		 * cambiar a lo largo del programa para calcular las ganancias
		 */
		
		//En caso de poner float seria: final double PRECIO_MANZANAS = 2.35f; sino se pone la f da error
		final double PRECIO_MANZANAS = 2.35;
		final double PRECIO_PERAS = 1.95;
		double total;

		// Pedimos la cantidad de manzanas y de peras

		// Cantidad de manzanas

		System.out.println("Introduzca la cantidad de manzanas en kg:");

		Scanner m = new Scanner(System.in);

		manzanas = m.nextDouble();

		// Cantidad de peras

		System.out.println("Introduzca la cantidad de peras en kg:");

		Scanner p = new Scanner(System.in);

		peras = p.nextDouble();

		// Calculamos las ganancias totales

		total = PRECIO_MANZANAS + PRECIO_PERAS;

		// Mostramos los resultados

		System.out.println("Las ganancias de las manzanas es de: " + PRECIO_MANZANAS);
		System.out.println("Las ganancias de las peras es de: " + PRECIO_PERAS);
		System.out.println("Las ganancias totales es de: " + total);

		m.close();
		p.close();

	}

}
