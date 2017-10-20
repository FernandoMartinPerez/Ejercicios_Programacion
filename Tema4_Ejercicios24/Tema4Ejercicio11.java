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
    
    int relojHora = 24;
    int relojMinutos = 00;

    System.out.println("¿Cuanto falta hasta medianoche?");
    System.out.print("Introduzca la hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int difHora = relojHora - hora;
    int difMin = 60 - minutos;
    
    System.out.println("Faltan " + difHora + "hora" + difMin + " minutos");
    //System.out.println(difMin);
    
    System.out.print("Faltan hasta medianoche: ");
    System.out.print((difHora *3600) + (difMin *60));
    System.out.print(" segundos");
    
    
    
    
    
    
  
    
    //System.out.print("Faltan hasta medianoche" + segundos + "segundos");

  }
}
