package parte2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Variables                                                                  
		int segundos;                                                                
		int hora;
		int minutos;
		int seg2;
		
		//crea el scanner                                                            
		Scanner sc= new Scanner(System.in);                                      
		                                                                             
		//Pide que introduzcas un numero                                             
		System.out.println("Introduzca los segundos");                                  
		                                                                             
		//introducir el numero                                                       
		segundos= sc.nextInt();
		
		//Calculos de hora minutos y segundos
		hora= (int)segundos/3600;
		minutos= (segundos%3600)/60;
		seg2= (segundos%3600)%60;
		
		//Te dice el resultado
		System.out.println(hora + "h " + minutos + "min " + seg2 + "seg"); 
		sc.close();

	}

}
