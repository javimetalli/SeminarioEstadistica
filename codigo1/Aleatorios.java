import java.util.Random;

public class Aleatorios{


	//Programa qe genera calificaciones aleatorias entre cero y diez
	public static void main(String[] args){

		Random aleatorios = new Random();

		//Genera números en el rango de 0 a 10
		// cantidad de 11 genera aleatorios del 0 ... 10
		int numero = aleatorios.nextInt(11);
		System.out.println(numero);

		//Genera pares entre 0 y 49
		//int numerosPares = aleatorios.nextInt(50)*2;
		//System.out.println(numerosPares);

		if(numero==0){
			System.out.println("Calificación es NP");
		}

		if(numero>=1 && numero<=5){
			System.out.println("Calificación es 5");
		}

		if(numero>=6 && numero<=10){
			System.out.println("Calificación: " + numero);


		}
	}
}