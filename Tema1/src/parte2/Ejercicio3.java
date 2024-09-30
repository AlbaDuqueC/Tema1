package parte2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Variables
		int numA;
		int resto;
		int numB;
		int result;
		
		//crea el scanner
		Scanner reader= new Scanner(System.in);
		
		//Pide que introduzcas un numero
		System.out.println("Introduzca un numero");
		
		//introducir el numero
		numA= reader.nextInt();
		
		/*Formula: conseguimnos el resto dividiendo numA con 7
		 * Teniendo el resto calculamos el numB restandole el resto a 7*/
		
		//calcular el resto
		resto= numA%7;
		
		//calculamos el numB
		numB=7-resto;
		
		//Calcular el resultado
		result= numB==7 ? 0:numB;
		
		//te dice el resultado final
		System.out.println(result);
		
		//cierra
		reader.close();

	}

}