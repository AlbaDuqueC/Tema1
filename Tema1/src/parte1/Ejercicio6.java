package parte1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Valores
		double num1;
		double num2;
		
		//Crea el escaner 
		Scanner reader  = new Scanner(System.in);
				
		//Pide al usuario el radio
		System.out.println("Introduzca un numero");
				
		//Introduce una nota mediante la console
		num1 = reader.nextDouble();
				
		//Intruduce un numero
		System.out.println("Introduzca un numero");
				
		//Introduce un numero mediante la console
		num2 = reader.nextDouble();
				
		//Calcula la suma con los dos numeros que el usuario a introducido
		System.out.println("La suma es: " + (num1+num2 ));
				
		//Calcula la resta con los dos numeros que el usuario a introducido
		System.out.println("La resta es: " + (num1-num2));
				
		//Calcula la multiplicación con los dos numeros que el usuario a introducido
		System.out.println("La multiplicación es: " + (num1*num2));
				
		//Calcula la división con los dos numeros que el usuario a introducido
		System.out.println("La división es: " + (num1/num2));
				
		//cierra el escaner
		reader.close();	

	}

}
