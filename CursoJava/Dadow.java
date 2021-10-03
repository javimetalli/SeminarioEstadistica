import java.util.Random;

public class Dadow{

		public static void main(String[] args){
			Random aleatorio = new Random();

			int valor = aleatorio.nextInt(6)+1;
			int intento = 1;

			if (valor != 6){

				while(valor != 6 ){
					valor = aleatorio.nextInt(6)+1;
					System.out.println("el valor aleatorio es: " + valor);

					intento = intento + 1;
					if (valor == 6){
						System.out.println("Ganaste en el intento: " + intento);
					}


				}
			}else {
				System.out.println("el valor aleatorios ya es 6");
			}
	
		}
}