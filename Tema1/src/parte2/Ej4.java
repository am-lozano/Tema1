package parte2;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		/*
		 * Dado el siguiente polinomio de segundo grado: y=ax2+bx+c 
		 * Crea un programa que pida los coeficientes a, b y c, 
		 * así como el valor de x, y calcula el valor correspondiente de y.
		 */
		
		//Pedimos las variables a, b y c
		
		double a;
		double b;
		double c;
		
		//Pedimos la incognita x
		
		double x;
		
		//Creamos una constante para la formula del polinomio
		
		final double OPERACION;
		
		//Pedimos los datos necesarios
		
		Scanner n = new Scanner (System.in);
		
		System.out.println("Introduca el valor de a");
		System.out.println("Introduca el valor de b");
		System.out.println("Introduca el valor de c");
		System.out.println("Introduca el valor de x");
		
		a = n.nextDouble();
		b = n.nextDouble();
		c = n.nextDouble();
		x = n.nextDouble();
		
		//Definimos el valor de la constante
		
		OPERACION = a * x * x + b * x + c;
		
		System.out.println(OPERACION);
		
		n.close();

		
	}

}
