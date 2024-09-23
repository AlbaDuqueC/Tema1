package parte1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
			//Crea el escaner 
			Scanner reader  = new Scanner(System.in);
			
			//Pide al usuario un numero
			System.out.println("Introduzca su año de nacimiento");
			
			//Introduce un numero mediante la console
			int añodenacimiento = reader.nextInt();
			
			System.out.println("Introduzca el año actual");
			
			//Introduce un numero mediante la console
			int añoactual = reader.nextInt();
			
			//Escribe el numero que el usuario a introducido
			System.out.println("Tienes " + (  añoactual - añodenacimiento)+ " años");
			reader.close();
	}

}
