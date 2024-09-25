package parte1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Valores
		int añodenacimiento;
		int añoactual;
		
		//Crea el escaner 
		Scanner reader  = new Scanner(System.in);
			
		//Pide al usuario su año de nacimiento
		System.out.println("Introduzca su año de nacimiento");
			
		//Introduce un numero mediante la console
		añodenacimiento = reader.nextInt();
			
		//Pide al usuario el año actual
		System.out.println("Introduzca el año actual");
			
		//Introduce un numero mediante la console
		 añoactual = reader.nextInt();
			
		//Calcula la edad mediante los años que el usuario a introducido
		System.out.println("Tienes " + (  añoactual - añodenacimiento)+ " años");
		
		//cierra el escaner
		reader.close();
	}

}

