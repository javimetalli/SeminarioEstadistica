import java.util.Scanner;


public class DistanciaTerminal {
  public static void main(String[] args) {

    Scanner cortana = new Scanner (System.in);

    //Punto 1
    System.out.println("Dado dos puntos, calculamos la distancia");
    System.out.println("Establece los valores del punto 1: ");
    System.out.println("Dame el valor de  x1: ");
    double x1 = cortana.nextDouble();
    System.out.println("Dame el valor de y1: ");
    double y1 = cortana.nextDouble();


    //Punto 2
    System.out.println("Dado dos puntos, calculamos la distancia");
    System.out.println("Establece los valores del punto 2: ");
    System.out.println("Dame el valor de  x2: ");
    double x2 = cortana.nextDouble();
    System.out.println("Dame el valor de y2: ");
    double y2 = cortana.nextDouble();



    double distancia = Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2 - y1), 2) );

    System.out.println("El punto 1 tiene coordenadas (x1,y1) -> " + "(" + x1 + "," + y1 + ")");
    System.out.println("El punto 2 tiene coordenadas (x2,y2) -> " + "(" + x2 + "," + y2 + ")");

    System.out.println("");
    System.out.println("La distancia entre los puntos es: " + distancia);





  }

}
