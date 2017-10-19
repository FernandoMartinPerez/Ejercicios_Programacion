/**
* Sentencia if
*
* @author Luis J. Sánchez
*/
public class SentenciaIfnota3 {
	public static void main(String[] args) {
		System.out.print("Por favor, introduce un número entero: ");
		String linea = System.console().readLine();
		double nota = Double.parsetdouble (linea);
		if (nota >= 5){
			System.out.println("El número introducido es negativo.");
		} else {
			System.out.println("El número introducido es positivo.");
		}
    }
}
