/**
* 
* Ejercicio 12
* Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
* que se imparten en el curso. Cada pregunta acertada sumará un punto. El
* programa mostrará al final la calificación obtenida. Pásale el minicuestionario
* a tus compañeros y pídeles que lo hagan para ver qué tal andan de conoci-
* mientos en las diferentes asignaturas del curso.
*
* @author Fernando
*/
public class Tema4Ejercicio12 {
	public static void main(String[] args) {
    

    System.out.println("1.¿Qué es un router?");
    System.out.println("a) Un dispositivo de red 	b) Una rotonda");
    System.out.println("c) Una patata 			d) Un tipo de fotocopiadora");
    String respuesta1 = (System.console().readLine().toLowerCase());
    int nota  = 0;
    if (respuesta1.equals("a")){
        nota++;
    }
    
    System.out.println("2.¿Qué asignatura no se da en 1ºDAW?");
    System.out.println("a) PROG        b) BBDD");
    System.out.println("c) REDES       d) FOL");
    String respuesta2 = (System.console().readLine().toLowerCase());

    if (respuesta2.equals("c")){
        nota++;
    }
    
    System.out.println("3.¿Solución a la 1ª Crisis del Software?");
    System.out.println("a) Flower power       b) Pelé");
    System.out.println("c) Ing.Software       d) Bill Gates");
    String respuesta3 = (System.console().readLine().toLowerCase());

    if (respuesta3.equals("c")){
        nota++;
    }
    
    System.out.println("4.¿Tipos de traductores a Leng Maquina?");
    System.out.println("a) Interpretes y cantantes       b) Interpretes y Compiladores");
    System.out.println("c) Mariano Rajoy y Donald Trump  d) Spanish is different");
    String respuesta4 = (System.console().readLine().toLowerCase());

    if (respuesta4.equals("b")){
        nota++;
    }
       
    
    System.out.println("5.¿Tipo de software básico?");
    System.out.println("a) ACCESS        b) LINUX");
    System.out.println("c) OFFICE        d) UTORRENT");
    String respuesta5 = (System.console().readLine().toLowerCase());

    if (respuesta5.equals("b")){
        nota++;
    }
    
    System.out.println("6.¿Que declara con int en java?");
    System.out.println("a) Lo invento Luis             b) Castigo de Dios");
    System.out.println("c) variable numerica decimal   d) variable  numerica entera");
    String respuesta6 = (System.console().readLine().toLowerCase());

    if (respuesta6.equals("d")){
        nota++;
    }
    
    System.out.println("7.¿Tipos de lenguajes alto nivel?");
    System.out.println("a) java         b) binario");
    System.out.println("c) ensamblador  d) soldador");
    String respuesta7 = (System.console().readLine().toLowerCase());

    if (respuesta7.equals("a")){
        nota++;
    }    
    
    System.out.println("8.¿comando linux para movernos entre directorios?");
    System.out.println("a) cd        b) dvd");
    System.out.println("c) bluray    d) cassete");
    String respuesta8 = (System.console().readLine().toLowerCase());

    if (respuesta8.equals("a")){
        nota++;
    }
    
    System.out.println("9.¿Qué necesitamos para ejecutar el Bytecode?");
    System.out.println("a) Maquina virtual Java      b) Oculus ");
    System.out.println("c) Realidad virtual Sony     d) Un descanso");
    String respuesta9 = (System.console().readLine().toLowerCase());

    if (respuesta9.equals("c")){
        nota++;
    }
    
    System.out.println("10.¿Qué es UML?");
    System.out.println("a) Pilar no lo sabe     b) Un lenguaje grafico ");
    System.out.println("c) Universidad          d) Sheldon lo sabe");
    String respuesta10 = (System.console().readLine().toLowerCase());

    if (respuesta10.equals("b")){
        nota++;
    }
    
    
    
    
    
    System.out.println("tu nota es " + nota);
    
    }
  }

