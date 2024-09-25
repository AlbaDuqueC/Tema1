package parte1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//valores
		int edad;
		
		//crea una boolea
		boolean mayor;
		//Crea el escaner 
		Scanner reader  = new Scanner(System.in);
		
		//Pide al usuario su edad
		System.out.println("Introduzca su edad:");
		
		//Introduce la edad mediante la console
		edad = reader.nextInt();
		
		//Si es mayor de edad 
		mayor= (edad >= 18);
		
		//Escribe si eres mayor de edad (true) o no (false) 
		System.out.println(mayor);
		
		//Cierra el escaner
	    reader.close();

	}

}
