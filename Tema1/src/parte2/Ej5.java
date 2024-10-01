package parte2;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		/*
		 * Diseña una aplicación que solicite al usuario que introduzca una cantidad de
		 * segundos. La aplicación debe mostrar cuántas horas, minutos y segundos hay en
		 * el número de segundos introducidos por el usuario.
		 */

		// Variable para los segundos pedidos por consola
		int seg;
		int min;
		int horas;
		int seg_finales;

		// Pedimos la cantidad de segundos

		Scanner sc = new Scanner(System.in);

		seg = sc.nextInt();

		// Pedimos los segundos
		System.out.println("Introduzca los segundos");

		// Hacemos los calculos necesarios
		horas = seg / 3600;
		min = (seg % 3600) / 60;
		seg_finales = seg % 60;

		// Mostramos los resultados
		System.out.println(horas + " h" + min + " min" + seg_finales + " s");

		// Cerramos el escaner
		sc.close();
	}

}
