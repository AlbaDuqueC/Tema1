package parte1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//crea los valores
		boolean par;
		int num;
	    
		//Crea el escaner 
		Scanner reader  = new Scanner(System.in);
				
		//Pide al usuario un numero
		System.out.println("Introduzca un numero:");
				
		//Introduce el numero mediante la console
		num = reader.nextInt();
				
		//Si es par 
		par= (num % 2 ==0);
				
		//Escribe si es par (true) o impar (impar) 
		System.out.println(par);
				
		//Cierra el escaner
		reader.close();

	}

}
