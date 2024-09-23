package parte1;


import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Crea el escaner 
		Scanner reader  = new Scanner(System.in);
		//Pide al usuario su edad
		System.out.println("Introduzca tu edad");
		//Introduce la edad mediante la console
		int edad = reader.nextInt();
		//Escribe la edad que vas a cumplir
		System.out.println("Vas a cumplir: " + (edad + 1));
		reader.close();
		// TODO Auto-generated method stub

	}

}
