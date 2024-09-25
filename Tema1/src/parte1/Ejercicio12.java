package parte1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		double peras;
		double manzanas;
		double cuesta;
		
		//Crea el escaner 
		Scanner reader  = new Scanner(System.in);
						
		//Pide al usuario cuantos kilos de peras quiere
		System.out.println("Introduzca cuantos kilos de peras quieres:");
						
		//Introduce el kilo de peras mediante la console
		peras = reader.nextDouble();
		
		//Pide al usuario cuantos kilos de manzana quiere
		System.out.println("Introduzca cuantos kilos de manzana quieres:");
								
		//Introduce el kilo de manzana mediante la console
		manzanas = reader.nextDouble();
		
		cuesta= (peras*1.95) + (manzanas*2.25);
		
		System.out.println("El total es "+ cuesta + " euros." );
		
		//Cierra el escaner
	    reader.close();

	}

}
