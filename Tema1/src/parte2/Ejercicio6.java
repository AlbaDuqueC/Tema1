package parte2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		        //Declaramos esta variable para calcular las medidas                                                                
				double milimetros;                                                                
				double centimetros;
				double metros;
				double suma;
				
				//crea el scanner                                                            
				Scanner sc= new Scanner(System.in);                                      
				                                                                             
				//Pide que introduzcas una medida                                             
				System.out.println("Introduzca una medida en milimetros");                                  
				                                                                             
				//introducir el numero                                                       
				milimetros= sc.nextDouble();
				
				//Pide que introduzcas una medida                                             
				System.out.println("Introduzca una medida en centimetros");                                  
				                                                                             
				//introducir el numero                                                       
				centimetros= sc.nextDouble();
				
				//Pide que introduzcas una medida                                             
				System.out.println("Introduzca una medida en metros");                                  
				                                                                             
				//introducir el numero                                                       
				metros= sc.nextDouble();
				
				//Calcular la suma de los tres datos
				suma= (milimetros/10) + (metros*100) + centimetros ;
				
				//imprime en pantalla la soluciñón
				System.out.println("la suma es: " + suma);
				
				//cierre del scanner
				sc.close();
	}

}
