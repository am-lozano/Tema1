package parte1;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		/*
		 * Escribir un programa que le pida dos números al usuario. A continuación, debe
		 * mostrar la suma, la resta, la multiplicación y la división de ambos números.
		 * Debe mostrarse el resultado de cada operación en una línea distinta.
		 */
		
		//Definimos las variables necesarias
		
		double n1;
		double n2;

		//Pedimos ambos numeros por consola
		
		System.out.println("Escriba un número: \n");
		
		Scanner numero1 = new Scanner (System.in);

		n1 = numero1.nextDouble();
		
		//Pedimos un numero menor al anterior para no tener que hacer un if para que los resultados sean positivos en la resta

		System.out.println("Escriba otro número, menor que el anterior: \n");

		Scanner numero2 = new Scanner (System.in);

		n2 = numero2.nextDouble();
		
		//Una vez obtenidos los resultados creamos las operaciones necesarias y las mostramos por pantalla
		
		double suma = n1 + n2;
		double resta = n1 - n2;
		double producto = n1 * n2;
		double division = n1 / n2;
		
		//Si lo ponemos entre parentesis hace la suma, pero con * y / no hacen falta los parentesis
		//System.out.println("La suma de " + (n1 + n2));
		
		System.out.println("La suma de " + n1 + " + " + n2 + " es = " + suma + "\n");
		System.out.println("La resta de " + n1 + " + " + n2 + " es = " + resta + "\n");
		System.out.println("El producto de " + n1 + " + " + n2 + " es = " + producto + "\n");
		System.out.println("La división de " + n1 + " + " + n2 + " es = " + division + "\n");

		numero1.close();
		numero2.close();
	}

}
