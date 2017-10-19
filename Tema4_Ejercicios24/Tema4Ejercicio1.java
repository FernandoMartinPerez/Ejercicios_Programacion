/**
* Ejercicio 1
* Escribe un programa que pida por teclado un día de la semana y que diga qué
* asignatura toca a primera hora ese día.
*
* @author Fernando
*/
public class Tema4Ejercicio1 {
	public static void main(String[] args) {
	System.out.print("Por favor, Introduzca un  dia de Lunes a Viernes: ");
	//toLowerCase() sirve para todo  lo que introduzca vaya en minuscula
	//toUpperCase() igual pero en mayuscula
	String dia = System.console().readLine().toLowerCase(); 
	String asignatura;
	
	switch (dia){
	case "lunes":
		asignatura = "Acostao to el  dia"; 
	break;
	case "martes":
		asignatura= "Programación";
	break;
	case "miercoles":
		asignatura= "Acostao 3 horas";
	break;
	case "jueves":
		asignatura= "Programación";
	break;
	case "viernes":
		asignatura= "Programación";
	break;

	default:
		asignatura= "No te toca nada";


			}

System.out.println("El  " + dia + " toca: " + asignatura);

	}
}
