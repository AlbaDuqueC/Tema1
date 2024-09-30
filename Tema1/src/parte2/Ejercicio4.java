package parte2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Variables                                                                  
		int numA;                                                                    
		int numB;                                                                   
		int numC;
		int numX;
		double numY;                                                                  
		                                                                             
		//crea el scanner                                                            
		Scanner reader= new Scanner(System.in);                                      
		                                                                             
		//Pide que introduzcas un numero                                             
		System.out.println("Introduzca los numeros");     
		
		//Pide que introduzcas un numero                                             
		System.out.println("A");                                                                                
		//introducir el numero                                                       
		numA= reader.nextInt(); 
		
		//Pide que introduzcas un numero                                             
		System.out.println("B");                                                                                
		//introducir el numero                                                       
		numB= reader.nextInt(); 
		
		//Pide que introduzcas un numero                                             
		System.out.println("C");                                                                                
		//introducir el numero                                                       
		numC= reader.nextInt();  
		
		//Pide que introduzcas un numero                                             
		System.out.println("X");                                                                                
		//introducir el numero                                                       
		numX= reader.nextInt(); 
		
		//calculamos y
		numY=(numA*(numX*numX)) + (numB*numX) + numC;
		
		System.out.println("Y vale: " + numY);
		
		reader.close();

	}

}
