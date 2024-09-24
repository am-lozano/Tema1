package parte1;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		// Declaramos las variables y pedimos los datos necesarios

		double radio;
		double longitud;
		double area;

		// Pedimos el valor del radio

		System.out.println("Introduzca el radio de su circunferencia:");

		Scanner sc = new Scanner(System.in);

		radio = sc.nextDouble();

		// Definimos el valor de la variable longitud una vez obtenido el valor de la
		// variable radio

		longitud = 2 * Math.PI * radio;

		System.out.println("La longitud de su circunferencia es de: " + longitud);

		area = Math.PI * radio * radio;

		System.out.println("El área de su circunferencia es de:" + area);

		sc.close();

	}

}
