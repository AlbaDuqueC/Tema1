package parte1;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		//valores
		double nota1;
		double nota2;
		
		//Crea el escaner 
		Scanner reader  = new Scanner(System.in);
		
		//Pide al usuario una nota
		System.out.println("Introduzca nota 1");
		
		//Introduce una nota mediante la console
		nota1 = reader.nextDouble();
		
		System.out.println("Introduzca nota 2");
		
		//Introduce una nota mediante la console
		nota2 = reader.nextDouble();
		
		//Calcula la mediade notas que el usuario a introducido
		System.out.println("Tienes un " + (  (nota1 + nota2) / 2) +" de media.");
		
		//Cierra el escane
		reader.close();

	}

}

