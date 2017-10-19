/**
*Ejercicio 11
*Realiza un conversor de Kb a Mb.
*/
public class T3Ejercicio11 {
  public static void main(String[] args) {
    // Entrada de datos
    String linea;
    System.out.print("Introduzca Kb: ");
    linea = System.console().readLine();
    double kiloByte;    
    kiloByte = Double.parseDouble( linea);

    // Operación
    double megaByte = (kiloByte / 1024);
    
    // Salida en pantalla
    System.out.print(megaByte + " Mb");

  }
}
