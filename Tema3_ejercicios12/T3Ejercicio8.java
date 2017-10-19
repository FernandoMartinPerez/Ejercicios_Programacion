/**
 * Ejercicio 8
 * Escribe un programa que calcule el salario semanal de un empleado en base
 * a las horas trabajadas, a razón de 12 euros la hora.
 *
 * @author Fernando
 */

public class T3Ejercicio8 {
  public static void main(String[] args) {
    // Entrada de datos
    String linea;
    System.out.print("Cuantas horas trabajo esta semana: ");
    linea = System.console().readLine();
    int horasTrabajadas;    
    horasTrabajadas = Integer.parseInt( linea);
    
    // Operación
    double salarioSemanal = (horasTrabajadas * 12); 
    
    // Salida en pantalla
    System.out.println("horas trabajadas: |" + horasTrabajadas + " horas");
    System.out.println("Salario semanal:  |" + (salarioSemanal) + " Euros");

  }
}
