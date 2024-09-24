package parte1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
	int aa;
	int an;
	int edad;
	
	//Pedimos el año actual
	
	System.out.println("Introduzca el año actual:");
	
	Scanner sc = new Scanner(System.in);
	
	aa = sc.nextInt();
	
	sc.close();
	
	//Pedimos el año de nacimiento
	
	System.out.println("Introduzca su año de nacimiento:");
	
	an = sc.nextInt();
	
	sc.close();
	
	//Mostramos la edad del usuario
	
	edad = aa + an;
	
	System.out.println("Su edad es " + edad );
	
	
	}

}