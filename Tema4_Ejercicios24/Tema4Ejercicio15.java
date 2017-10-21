/**
* 
* Ejercicio 15
* Escribe un programa que pinte una pirámide rellena con un carácter introdu-
* cido por teclado que podrá ser una letra, un número o un símbolo como *, +,
* -, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si
* el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la
* izquierda o hacia la derecha.
*
* @author Fernando
*/
public class Tema4Ejercicio15 {
    public static void main(String[] args) {
    // Aquí comenzamos meter datos por consola Uso String para la variable
    // ya que voy a meter caracteres
    System.out.println("Vamos a crear una piramide con caracteres");
    System.out.println("letras, un número o algun simbolo como ");
    System.out.println("estos *, +, -, $, &, etc....");
    String tecla = System.console().readLine();
    
    System.out.println("A que dirección del vertice: ");
    System.out.println("up, down, left, right");
    String direccion = System.console().readLine().toLowerCase();
            
    // Ahora hacemos que cree la piramide con un switch para elegir cada
    // caso en particular.
    
      switch (direccion) {
        case "up":
        System.out.printf("%10s \n" , "    " +tecla+tecla+ "    ");
        System.out.printf("%10s \n" , "   " + tecla+tecla+tecla+tecla + "   ");
        System.out.printf("%10s \n" , "  " + tecla+tecla+tecla+tecla+tecla+tecla+"  ");
        System.out.printf("%10s \n" , " " + tecla+tecla+tecla+tecla+tecla+tecla+tecla+tecla+" ");
        break;
        
        case "down":
        System.out.printf("%10s \n" , " " + tecla+tecla+tecla+tecla+tecla+tecla+tecla+tecla+" ");
        System.out.printf("%10s \n" , "  " + tecla+tecla+tecla+tecla+tecla+tecla+"  ");
        System.out.printf("%10s \n" , "   " + tecla+tecla+tecla+tecla + "   ");
        System.out.printf("%10s \n" , "    " +tecla+tecla+ "    ");
        break;
        
        case "left":
        System.out.printf("%-15s \n" , "     " + tecla);
        System.out.printf("%-15s \n" , "     " + tecla+tecla+tecla);
        System.out.printf("%-15s \n" , "     " + tecla+tecla+tecla+tecla+tecla);
        System.out.printf("%-15s \n" , "     " + tecla+tecla+tecla);
        System.out.printf("%-15s \n" , "     " + tecla);
        break;
        
        case "right":
        System.out.printf("%10s \n" , tecla);
        System.out.printf("%10s \n" , tecla+tecla+tecla);
        System.out.printf("%10s \n" , tecla+tecla+tecla+tecla+tecla);
        System.out.printf("%10s \n" , tecla+tecla+tecla);
        System.out.printf("%10s \n" , tecla);
        break;
        
        }
    
  }
}
