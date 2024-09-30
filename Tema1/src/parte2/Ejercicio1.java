package parte2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Variable
		double num;
		
		//crear scanner
		Scanner reader= new Scanner(System.in);
		
		//Pide que introduzcas un numero
		System.out.println("Introduzca un numero");
		
		//introducir el numero
		num= reader.nextDouble();	
		
		//Calculo de redondeo
		System.out.print((int)(num+0.5));
		
		//Cerrar el scanner
		reader.close();

	}

}
