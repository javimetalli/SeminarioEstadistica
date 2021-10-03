public class Distancia {
  public static void main(String[] args) {

    double x1 = -4;
    double y1 = -3;

    double x2 = -4;
    double y2 = -3;

    double distancia = Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2 - y1), 2) );

    System.out.println("El punto 1 tiene coordenadas (x1,y1) -> " + "(" + x1 + "," + y1 + ")");
    System.out.println("El punto 2 tiene coordenadas (x2,y2) -> " + "(" + x2 + "," + y2 + ")");

    System.out.println("");
    System.out.println("La distancia entre los puntos es: " + distancia);

    



  }

}
