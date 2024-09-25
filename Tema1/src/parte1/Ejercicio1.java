package parte1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) { 
		//Valores
		double numero;
		
		//Crea el escaner 
		Scanner reader  = new Scanner(System.in);
		
		//Pide al usuario un numero
		System.out.println("Introduzca un numero");
		
		//Introduce un numero mediante la console
		numero = reader.nextDouble();
		
		//Escribe el numero que el usuario a introducido
		System.out.println("Has escrito el numero: " + numero);
		
		//Cierre del escaner
		reader.close();		 

	}

}
