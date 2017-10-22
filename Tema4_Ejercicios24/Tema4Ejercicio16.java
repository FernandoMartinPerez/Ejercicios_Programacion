/**
* 
* Ejercicio 16
* Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
* nos está siendo infiel. El programa irá haciendo preguntas que el usuario
* contestará con verdadero o falso. Cada pregunta contestada como verdadero
* sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. Utili-
* za el fichero test_infidelidad.txt para obtener las preguntas y las conclusiones
* del programa.
*
* @author Fernando
*/
public class Tema4Ejercicio16 {
	public static void main(String[] args) {
    
    int notaTest = 0;
    System.out.println("1.  Tu pareja parece estar más inquieta de lo normal");
    System.out.println("    sin ningún motivo aparente.");
    System.out.println("    a) si  b) no");
    String respuesta1 = (System.console().readLine().toLowerCase());

    if (respuesta1.equals("a")){
    notaTest +=3;
    }
    
    System.out.println("2.  Ha aumentado sus gastos de vestuario");
    System.out.println("    a) si  b) no");
    String respuesta2 = (System.console().readLine().toLowerCase());
    
    if (respuesta2.equals("a")){
    notaTest +=3;
    }
    
    System.out.println("3.  Ha perdido el interés que mostraba anteriormente por ti");
    System.out.println("    a) si  b) no");
    String respuesta3 = (System.console().readLine().toLowerCase());
    if (respuesta3.equals("a")){
    notaTest +=3;
    }
    
    System.out.println("4.  Ahora se arregla el pelo y se asea con más frecuencia");
    System.out.println("    a) si  b) no");
    String respuesta4 = (System.console().readLine().toLowerCase());
    if (respuesta4.equals("a")){
    notaTest +=3;
    }
    
    System.out.println("5.  No te deja que mires la agenda de su teléfono móvil");
    System.out.println("    a) si  b) no");
    String respuesta5 = (System.console().readLine().toLowerCase());
    if (respuesta5.equals("a")){
    notaTest +=3;
    }
    
    System.out.println("6.  A veces tiene llamadas que dice no querer contestar");
    System.out.println("    cuando estás tú delante ");
    System.out.println("    a) si  b) no");
    String respuesta6 = (System.console().readLine().toLowerCase());
    if (respuesta6.equals("a")){
    notaTest +=3;
    }
    
    System.out.println("7.  Últimamente se preocupa más en cuidar la línea y");
    System.out.println("    estar bronceada");
    System.out.println("    a) si  b) no");
    String respuesta7 = (System.console().readLine().toLowerCase());
    if (respuesta7.equals("a")){
    notaTest +=3;
    }
    
    System.out.println("8.  Muchos días viene tarde después de trabajar porque");
    System.out.println("    dice tener mucho más trabajo"); 
    System.out.println("    a) si  b) no");
    String respuesta8 = (System.console().readLine().toLowerCase());
    if (respuesta8.equals("a")){
    notaTest +=3;
    }
    
    System.out.println("9.  Has notado que últimamente se perfuma más");
    System.out.println("    a) si  b) no");
    String respuesta9 = (System.console().readLine().toLowerCase());
    if (respuesta9.equals("a")){
    notaTest +=3;
    }
    
    System.out.println("10. Se confunde y te dice que ha estado en sitios donde");
    System.out.println("    no ha ido contigo");
    System.out.println("    a) si  b) no");
    String respuesta10 = (System.console().readLine().toLowerCase());
    if (respuesta10.equals("a")){
    notaTest +=3;
    }
    
    System.out.println("tu nota es " + notaTest);
    if ((notaTest >= 0) && (notaTest <= 10)){
      System.out.println("   ¡Enhorabuena! tu pareja parece ser totalmente fiel.");
      } else if ((notaTest >= 11) && (notaTest <= 22)){
          System.out.println("Quizás exista el peligro de otra persona en su"); 
          System.out.println("vida o en su mente, aunque seguramente será algo");
          System.out.println("sin importancia. No bajes la guardia.");
      } else if((notaTest >= 23) && (notaTest <= 30)){
          System.out.println("Tu pareja tiene todos los ingredientes para estar");
          System.out.println("viviendo un romance con otra persona. Te aconseja-");
          System.out.println("mos que indagues un poco más y averigües que es lo");
          System.out.println("que está pasando por su cabeza.");
      }
    
    }
  }
