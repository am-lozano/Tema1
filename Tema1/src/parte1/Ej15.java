package parte1;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa en el que declares una constante IVA de valor igual a 21.
		 * A continuación, pídele un precio al usuario (recuerda que los precios
		 * contienen decimales) y calcula cuál será el precio final con el IVA aplicado.
		 * 
		 */

		//Declaramos las variables
		
		double precio;
		double total;
		
		//Creamos la const IVA
		
		final int IVA = (21/100);
		
		//Pedimos el precio deseado por consola
		
		System.out.println("Introduzca el precio deseado:");
		
		Scanner sc = new Scanner (System.in);
		
		precio = sc.nextDouble();
		
		//Calculamos cual sera el precio con los impuestos añadidos (IVA) y mostramos el resultado
		
		total = (precio + precio * IVA);
		
		System.out.println("El precio total es de: " + total + "€");
		
		sc.close();
		
	}

}
