/**
* 
* Ejercicio 3
* Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
* diente nombre del día de la semana.
*
* @author Fernando
*/
public class Tema4Ejercicio3 {
	public static void main(String[] args) {
	System.out.print("Por favor, Introduzca un  numero del 1 al  7: ");
	int numero = Integer.parseInt(System.console().readLine());
	String diaSemana;
	
	switch (numero){
	case 1 :
		diaSemana = "Lunes"; 
	break;
	case 2 :
		diaSemana = "Martes";
	break;
	case 3 :
		diaSemana = "Miercoles";
	break;
	case 4 :
		diaSemana = "Jueves";
	break;
	case 5 :
		diaSemana = "Viernes";
	break;
  case 6 :
		diaSemana = "Sabado";
	break;
  case 7 :
		diaSemana = "Domingo";
	break;

	default:
		diaSemana = "No te toca nada";


			}

System.out.println("El numero " + numero + " es el: " + diaSemana);

	}
}
