package parte1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Valores
		String nombre;
		String edad;
		
		//Crea el escaner 
		Scanner reader  = new Scanner(System.in);
				
		//Pide al usuario su nombre
		System.out.println("Introduzca su nombre:");
				
		//Introduce el nombre mediante la console
		nombre = reader.nextLine();
				
		//Pide al usuario su edad
		System.out.println("Introduzca su edad:");
				
		//Introduce la edad mediante la console
		edad = reader.nextLine();
				
		//Escribe el nombre que el usuario a introducido
		System.out.println("Hola " + nombre +", tienes " + edad +" añoss, ¡qué mayor eres!");
				
		//Cierra el escaner
		reader.close();

	}

}
