package parte1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		//crear los valores
		double pesetas;
		double euros;
		
		//Crea el escaner 
		Scanner reader  = new Scanner(System.in);
				
		//Pide al usuario su edad
		System.out.println("Introduzca la cantidad en pesetas:");
				
		//Introduce la edad mediante la console
		pesetas = reader.nextDouble();
		
		//cambio de pesetas a euros
		euros = (pesetas/166);
		
		//Escribe la cifra
		System.out.println("Serian "+euros+" euros.");
		
		//Cierra el escaner
	    reader.close();

	}

}
