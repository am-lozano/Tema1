package parte1;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {

		/*
		 * Realiza un conversor de pesetas a euros. Para ello, pídele al usuario que te
		 * introduzca el valor en pesetas y, a posteriori, debes mostrarle el resultado
		 * de la conversión.(1€ = 166 ptas)
		 */

		// Declaramos las variables necesarias,

		// Utilizamos double porque puede tener centimos al convertirlo

		double cantidad;
		
		//Lo declarmos como constante ya que la conversion no va a cambiar 
		// Hacemos las conversion de pesetas a euros

		final double EUROS;

		// Pedimos que se introduzca la cantidad a cambiar

		System.out.println("Introduzca la cantidad en ptas (pesetas) que quiera convertir a € (euros):");

		Scanner c = new Scanner(System.in);

		cantidad = c.nextDouble();

		// Hacemos la conversion y mostramos el resultado

		EUROS = cantidad / 166;

		System.out.println(cantidad + " ptas son " + EUROS + " €");

		c.close();

	}

}
