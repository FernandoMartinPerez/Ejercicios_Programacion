/**
* Ejercicio 4
* Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
* las horas extras. Escribe un programa que calcule el salario semanal de un
* trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
* trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
* euros la hora.
* 
*
* @author Fernando
*/
public class Tema4Ejercicio4 {
    public static void main(String[] args) {

    int sueldoSemanal;

    System.out.print("Por favor, ¿Cuantas horas ha trabajado? ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    //Si trabajas  menos de 40 horas  pues horas * 12
    //sino "else" 40 * 12 + las horas que trabajas menos 40
    //para allar la diferencia ej  50 h trabajadas sera 50 - 40
    // igual 10 *  16, ya  que las 40 primeras es * 12
    
    if (horasTrabajadas < 40) {
      sueldoSemanal = 12 * horasTrabajadas;
    } else {
      sueldoSemanal = (40 * 12) + ((horasTrabajadas - 40) * 16);    
    }
    System.out.println("Esta semana cobraras: " + sueldoSemanal + " euros");
  }
}
