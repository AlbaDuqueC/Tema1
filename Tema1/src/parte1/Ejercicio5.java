package parte1;

import java.util.Scanner;

public class Ejercicio5 {

	private static final double PI = 3.14;

	public static void main(String[] args) {
		//Crea el escaner 
		Scanner reader  = new Scanner(System.in);
		
		//Pide al usuario el radio
		System.out.println("Introduzca el radio de la circunferencia:");
		
		//Introduce el radio mediante la console
		double radio = reader.nextDouble();
		
		//Calcula la longitud y el area con el radio que el usuario a introducido
		System.out.println("La longitud de la circunferenvia es: " + ( 2 * PI * radio));
		System.out.println("El Area de la circunferenvia es: " + (PI * (radio*radio)));
		reader.close();	

	}

}