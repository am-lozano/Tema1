package parte2;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		/*
		 * Solicita al usuario tres distancias: La primera, medida en milímetros. La
		 * segunda, medida en centímetros. La última, medida en metros. Diseña un
		 * programa que muestre la suma de las tres longitudes introducidas (medida en
		 * centímetros).
		 */

		// Creamos 2 constantes para pasar las medidas introducidas en mm y m a cm 

		final double MM;
		final double M;
		
		// Creamos las variables y pedimos las distancias

		double mm;
		double cm;
		double m;
		
		//Variable para sumar todos los datos
		
		double total;

		System.out.println("Introduzca su distancia en mm:");
		System.out.println("Introduzca su distancia en cm:");
		System.out.println("Introduzca su distancia en m:");

		Scanner sc = new Scanner(System.in);

		mm = sc.nextDouble();
		cm = sc.nextDouble();
		m = sc.nextDouble();
		
		//Converitmos los mm y los m a cm
		
		MM = mm / 10;
		M = m * 100;
		
		//Sumamos todos los datos en cm y mostramos el total
		
		total = MM + cm + M;
		
		System.out.println(total);
		
		sc.close();
		
	}

}
