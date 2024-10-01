package parte2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		 //Declaramos esta variable para calcular las medidas                                                                                                                               
		double centimetros;
		double metros;
		
		//Declaramos la constante
		final double CONVERSION= 1000;
		
		//crea el scanner                                                            
		Scanner sc= new Scanner(System.in);                                      
		                                                                             
		//Pide que introduzcas una medida                                             
		System.out.println("Introduzca una medida de la longitud en metros");                                  
		                                                                             
		//introducir el numero                                                       
		metros= sc.nextDouble();
		
		//convertimos los metros a centimetros
		centimetros= metros*CONVERSION;
		
		//Imprime por pantalla el resultadio
		System.out.println(centimetros + " cm");
		
		//cerramos el scanner
		sc.close();

	}

}
