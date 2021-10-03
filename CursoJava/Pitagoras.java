//utilizando API de java
import java.util.Scanner;

public class Pitagoras{

public static void main(String[] args){

//Calcular el valor de la hipotenusa C de un triángulo rectángulo dados los catettos a y b

//Algoritmo
//Tener los valores de A y B;
//Aplicar la fórmula del teorema
// C = RAIZ CUADRADA (A CUADRAD + B CUADRADA)



Scanner teclado = new Scanner(System.in);

System.out.println("Dame el valor de A: ");
double a = teclado.nextDouble();
System.out.println("Dame el valor de B: ");
double b = teclado.nextDouble();

System.out.println();
System.out.println();


double c = Math.sqrt((a*a) + (b*b));
System.out.println("el valor de la hipotenusa es: " + c);



}

}
