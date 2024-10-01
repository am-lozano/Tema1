package parte2;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {

		/*
		 * La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una
		 * competición donde cada participante escribe un algoritmo en un papel y lo
		 * lanza, ganando quien consiga lanzarlo más lejos. La peculiaridad del concurso
		 * es que la longitud del lanzamiento se mide en metros (con tantos decimales
		 * como se desee), pero para el ranking solo se tiene en cuenta la longitud en
		 * centímetros (sin decimales). Por ejemplo, para un lanzamiento de 12,3456 m,
		 * que son 1234,56 cm solo se contabilizan 1234 cm. Realiza un programa que
		 * solicite la longitud (en metros) de un lanzamiento y muestre la parte entera
		 * correspondiente en centímetros. Utiliza la conversión de tipos.
		 * 
		 */
		
		//Variable para los metros lanzados
		double m;
		
		//Variable para pasar los metros a centimetros
		final int RESULTADO;
		
		//Creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		//Pedimos los metros lanzados
		System.out.println("Introduzca la longitud en metros:");
		
		m = sc.nextDouble();
		
		//Pasamos los metros a centimetros
		RESULTADO = (int) (m * 100);
		
		//Mostramos el resultado
		System.out.println("Su lanzamiento ha sido de:" + RESULTADO);
		
		//Cerramos el escaner
		sc.close();
	}

}
