package parte1;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		//Crea los valores
		int nota1;
		int nota2;
		int nota3;
		double mediaentera;
		
		
		//Crea un scanner
		Scanner reader= new Scanner(System.in);
		
		//Te pide las notas
		System.out.println("Introduzca las notas:");
		
		//Introduce las notas
		nota1= reader.nextInt();
		nota2= reader.nextInt();
		nota3= reader.nextInt();
		
		//Calcula la media
		mediaentera= ((double) (nota1+nota2+nota3))/3;
		
		//Te dice la media
		System.out.println("Boletin:" + (int)mediaentera);
		System.out.println("Boletin:" + mediaentera);
		//cierra el scanner
		reader.close();
		

	}

}
