//Dado un cubo de lado cococido a 
//Calcular el volumen 

import java.util.Scanner;

public class Figuras{

public static void main(String[] args){

	Scanner lecturas = new Scanner(System.in);

	System.out.println("Programa que calcula el volumen de un cubo");
	System.out.println("Escribe el valor de a: ");

	int a = lecturas.nextInt();
	
	double volumen = Math.pow(a,3);

	System.out.println("Volumen:" + volumen); 

}

}