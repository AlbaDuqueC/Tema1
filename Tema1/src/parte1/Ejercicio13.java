package parte1;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		//crear las boolea
		boolean llover;
		boolean tarea;
		boolean biblioteca;
		boolean salir;
		
		//Crea el escaner 
		Scanner reader  = new Scanner(System.in);
				
		//Pregunta si esta lloviendo
		System.out.println("¿Esta lloviendo?");
				
		//Introduce si llueve o no mediante la console
		llover = reader.nextBoolean();
				
		//Pregunta si has hecho la tarea
		System.out.println("¿Has hecho las tareas?");
						
		//Introduce si has hecho la tarea la console
		tarea = reader.nextBoolean();
		
		//Pregunta si vas a la biblioteca
		System.out.println("¿Quieres ir a la biblioteca?");
								
		//Introduce la si vas a la boblioteca mediante la console
		biblioteca = reader.nextBoolean();
		
		//Formula para decidir si sales o no
		salir= (llover&&tarea)||biblioteca ;
				
		//Escribe si sale (true) o no (false) 
		System.out.println(salir);
				
		//Cierra el escaner
		reader.close();

	}

}
