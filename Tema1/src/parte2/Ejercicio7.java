package parte2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		 //Declaramos esta variable para calcular el precio                                                                
		double infantiles;                                                                
		double adultos;
		double precio;
		double result;
		
		//Declaramos las constantes para calcular el precio
		final double PRECIO_INFANTILES = 15.5;
		final double PRECIO_ADULTO= 20;
		final double DESCUENTO= 0.05;
		
		//crea el scanner                                                            
		Scanner sc= new Scanner(System.in);                                      
		                                                                             
		//Pide que introduzcas una medida                                             
		System.out.println("Introduzca cuantas entradas infantiles quieres");                                  
		                                                                             
		//introducir el numero                                                       
		infantiles= sc.nextInt();
		
		//Pide que introduzcas una medida                                             
		System.out.println("Introduzca cuantas entradas adultas quieres");                                  
		                                                                             
		//introducir el numero                                                       
		adultos= sc.nextInt();
		
		//Clacula el precio total
		precio= (infantiles*PRECIO_INFANTILES) + (adultos*PRECIO_ADULTO);
		
		//Si es mayor de 100 euros, se aplica el descuento de 5%
		result= precio>=100 ? precio - precio*DESCUENTO  :precio ;
		
		//Se imprime el precio total
		System.out.println(result + " euros");
		
		//cerramos el scanner
		sc.close();

	}

}
