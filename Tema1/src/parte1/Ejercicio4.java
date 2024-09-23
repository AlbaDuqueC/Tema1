package parte1;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		//Crea el escaner 
		Scanner reader  = new Scanner(System.in);
		
		//Pide al usuario una nota
		System.out.println("Introduzca nota 1");
		
		//Introduce una nota mediante la console
		double nota1 = reader.nextDouble();
		
		System.out.println("Introduzca nota 2");
		
		//Introduce una nota mediante la console
		double nota2 = reader.nextDouble();
		
		//Escribe la mediade notas que el usuario a introducido
		System.out.println("Tienes un " + (  (nota1 + nota2) / 2) +" de media.");
		reader.close();

	}

}
