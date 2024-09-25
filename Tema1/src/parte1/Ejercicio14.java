package parte1;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		//Crea los valores
		int nota1;
		int nota2;
		int nota3;
		int mediaentera;
		double expedienteac;
		
		//Crea un scanner
		Scanner reader= new Scanner(System.in);
		
		System.out.println("Introduzcs las notas:");
		
		nota1= reader.nextInt();
		nota2= reader.nextInt();
		nota3= reader.nextInt();
		
		mediaentera= (int) ((nota1+nota2+nota3)/3);
		expedienteac= (double) ((nota1+nota2+nota3)/3);
		
		System.out.println("Boletin:" + mediaentera);
		System.out.println("Boletin:" + expedienteac);
		//cierra el scanner
		reader.close();
		

	}

}
