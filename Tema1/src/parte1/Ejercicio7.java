package parte1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Crea el escaner 
		Scanner reader  = new Scanner(System.in);
		
		//Pide al usuario su nombre
		System.out.println("Introduzca su nombre:");
		
		//Introduce el nombre mediante la console
	    String nombre = reader.nextLine();
		
	    //Pide al usuario su dirección
		System.out.println("Introduzca su dirección:");
		
		//Introduce la dirección mediante la console
		String dirección = reader.nextLine();
		
		//Introduce un numero de telefono mediante la console
	    System.out.println("Introduzca su telefono:");
		
		//Introduce el numero mediante la console
		String telefono = reader.nextLine();
		
		//Escribe el nombre que el usuario a introducido
		System.out.println("Nombre: " + nombre);
		
		//Escribe la dirección que el usuario a introducido
		System.out.println("Dirección: " + dirección);
		
		//Escribe el telefono que el usuario a introducido
		System.out.println("Telefono: " + telefono);
				
		//cierra el escaner
		reader.close();	

	}

}
