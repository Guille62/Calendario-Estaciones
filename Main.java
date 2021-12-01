import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner dato = new Scanner(System.in);
    System.out.println("Escribe un número");

    int mes = dato.nextInt();
    String nombreMes = "Estación no encontrada";


    if(mes == 1 || mes == 2 || mes == 3) {
       nombreMes = "Estás en Enero, Febrero o Marzo";
    }
    else if(mes == 4 || mes == 5 || mes == 6) {
       nombreMes ="Estás en Abril, Mayo o Junio";
    }
    else if(mes == 7 || mes == 8 || mes == 9) {
       nombreMes = "Estás en Julio, Agosto o Septiembre";
    }
    else if(mes == 10 || mes == 11 || mes == 12) {
       nombreMes = "Estás en Octubre, Noviembre o Diciembre";
    }

    System.out.println(nombreMes);
    
  }
}