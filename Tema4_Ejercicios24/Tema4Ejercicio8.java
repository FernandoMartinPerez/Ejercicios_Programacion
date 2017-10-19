/**
* Ejercicio 8
* Amplía el programa anterior para que diga la nota del boletín (insuficiente,
* suficiente, bien, notable o sobresaliente).
* 
*
* @author Fernando
*/
public class Tema4Ejercicio8 {
    public static void main(String[] args) {
    
    //introduzco el dato que varía por  teclado
    System.out.println("Vamos a calcular la nota media del curso");
    System.out.println("Introduzca la nota 1er examen: ");
    double examen1 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca la nota 2do examen: ");
    double examen2 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca la nota 3er examen: ");
    double examen3 = Double.parseDouble(System.console().readLine());
    
    //Represento la formula para  resolver el problema
    double media = (examen1 + examen2 + examen3)/3;
    
    //Represento la  solución con dos  decimales
    System.out.print("La nota media es: ");
    System.out.printf("%.2f", media);
    System.out.println(" siga esforzandose.");
    
    // Aqui consigo que me de la calificación
        if ((media >= 0) && (media < 5)) {
          System.out.println("Insuficiente");
    }     else{
            if ((media == 5) && (media < 6)) {
              System.out.println("Suficiente");
    }         else{
                if ((media ==6) && (media <  7)) {
                  System.out.println("Bien");
    }           else{
                  if  (media < 9) {
                    System.out.println("Notable");
    }             else {
                    
                      System.out.println("Sobresaliente");
    }  
      
      
      }
    }
  }
}
}



