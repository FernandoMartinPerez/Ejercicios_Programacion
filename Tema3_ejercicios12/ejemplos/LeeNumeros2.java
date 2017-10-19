/**
* Lectura de datos desde teclado pero resumiendo las lineas
*
* @author Fernando
*/
public class LeeNumeros2 {
public static void main(String[] args) {
    //String linea;
    System.out.print("Por favor, introduce un número: ");
    //linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( System.console().readLine() );
    
    //En este segundo en vez de ser un nº entero es uno decimal
    //Tambien si usamos un entero largo existe Long.parseLong
    
    System.out.print("introduce otro, por favor: ");
    //linea = System.console().readLine();
    double segundoNumero;
    segundoNumero = Double.parseDouble( System.console().readLine() );
    
    double total;
    total = (2 * primerNumero) + segundoNumero;
    System.out.print("El primer número introducido es " + primerNumero);
    System.out.println(" y el segundo es " + segundoNumero);
    System.out.print("El doble del primer número más el segundo es ");
    System.out.print(total);
}
}
