/**
*Ejercicio 10
*Realiza un conversor de Mb a Kb.
*/
public class T3Ejercicio10 {
  public static void main(String[] args) {
    // Entrada de datos
    String linea;
    System.out.print("Introduzca Mb: ");
    linea = System.console().readLine();
    double megaByte;    
    megaByte = Double.parseDouble( linea);

    // Operación
    double kiloByte = (megaByte * 1024);
    
    // Salida en pantalla
    System.out.print(kiloByte + " Kb");

  }
}
