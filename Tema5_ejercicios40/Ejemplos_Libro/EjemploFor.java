/**
* Bucle for
*
* @author Luis José Sánchez
*/
public class EjemploFor {
  public static void main(String[] args) {
    // expresion1 inicia una variable y le da el valor 1
    // expresion2 i menor que 11
    // expresion3 i se va incrementando sumando 1, cuando termina de imprimir suma 1
    // y cuando llega a 11 para en 10
    for (int i = 1; i < 11; i++) {
    System.out.print("    Iteracción nº = " + i);
    System.out.print("Hola ");
    System.out.print(i + " ");
    System.out.println(i*2);
    // hasta que no termina lo que hay dentro de las llaves no se suma nada
        }
  }
}
