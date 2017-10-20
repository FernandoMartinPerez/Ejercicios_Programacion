/**
* 
* Ejercicio 11
* Escribe un programa que dada una hora determinada (horas y minutos),
* calcule los segundos que faltan para llegar a la medianoche.
*
* @author Fernando
*/
public class Tema4Ejercicio11 {
    public static void main(String[] args) {
    // Meto variables fijas que me ayudaran para los calculos
    int relojHora = 24;
    int relojMinutos = 00;
    
    // Introduzco las variables hora y 
    System.out.println("¿Cuanto falta hasta medianoche?");
    System.out.print("Introduzca la hora (entre las 00 y las 23): ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora los minutos (entre las 00 y las 59): ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    if ((hora < 0) || (hora > 23) || (minutos < 0) || (minutos > 59)) {
      System.out.print("Los datos introducidos no son correctos");
    } else {
    // Hago los calculos
          int difHora = relojHora - hora;
          int difMin = 60 - minutos;
    
    // Represento la solución
          System.out.println("Faltan " + difHora + " hora " + difMin + " minutos");
          System.out.print("Faltan hasta medianoche: ");
          System.out.print((difHora * 3600) + (difMin * 60));
          System.out.print(" segundos");    
    }
  }
}
