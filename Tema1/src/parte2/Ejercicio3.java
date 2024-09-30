package parte2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Variables
		int numA;
		int resto;
		int numB;
		int resultado;
		int result;
		
		//crea el scanner
		Scanner reader= new Scanner(System.in);
		
		//Pide que introduzcas un numero
		System.out.println("Introduzca dos numeros");
		
		//introducir el numero
		numA= reader.nextInt();
		//introducir el numero
		numB= reader.nextInt();
		
		/*Formula: conseguimnos el resto dividiendo numA con numB
		 * Teniendo el resto calculamos el resultado restandole el resto a numB*/
		
		//calcular el resto
		resto= numA%numB;
		
		//calculamos el numB
		resultado=numB-resto;
		
		//Calcular el resultado
		result= resultado==numB ? 0:resultado;
		
		//te dice el resultado final
		System.out.println(result);
		
		//cierra
		reader.close();

	}

}