package parte1;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		//valores
		double precio;
		double precioiva;
		
		//Crea un scanner
		Scanner reader= new Scanner(System.in);
				
		//Te pide un precio
		System.out.println("Introduzca un precio:");
				
		//Introduce un precio
		precio= reader.nextInt();
		
		//Calculo
		precioiva= precio+ (precio*0.21);
		
		//Te escribe el precio con iva
		System.out.println("Precio con IVA " + precioiva);
		
		//cerrar escaner
		reader.close();

	}

}
