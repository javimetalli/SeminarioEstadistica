import java.util.Random;

public class Edad{

	public static void main(String[] args) {


		Random aleatorio = new Random();

		int i = aleatorio.nextInt(101);
		System.out.println("la edad es: " + i);
		//int cupo = 40000;

	if(i>=10){
		if (i<18){
			if (i>=12){
				System.out.println("puedes presentar un escrito de tu tutor");
			}else{
				System.out.println("puedes vacunarte, en supervision de un adulto");
			}


			System.out.println("puedes vacunarte, con supervision de un adulto");
		}

		if (i >= 18){
			
			System.out.println("puedes vacunarte eres adulto");
		
		}
	}else{
			System.out.println("eres muy joven para ser vacunado");
		}
	}
}