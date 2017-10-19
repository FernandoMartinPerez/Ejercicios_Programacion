/**
 * Tabla formateada para hacer el horario de colores
 *
 * @author Nandi
 */

public class ejercicio5B {
  public static void main(String[] args) {
    
    String r = "\033[31m";
    String v = "\033[32m";
    String n = "\033[33m";
    String a = "\033[34m";
    String m = "\033[35m";
    String b = "\033[37m";

    
    
    
    System.out.printf("%-5s  %-6s   %-9s     %-9s     %-9s     %-9s\n","Lunes","Martes","Miercoles","Jueves","Viernes");
    System.out.println("-----------------------------------------------------");
    System.out.printf("%-11s  %-6s   %-6s     %-6s     %-6s     %-6s\n",b + "08:15-09:15",r + "SINF",v+"PROG",r + "SINF",v+"PROG",v + "PROG");
    System.out.printf("%-11s  %-6s   %-6s     %-6s     %-6s     %-6s\n",b + "09:15-10:15",r + "SINF",v+"PROG",r + "SINF",v+"PROG",v + "PROG");
    System.out.printf("%-11s  %-6s   %-6s     %-6s     %-6s     %-6s\n",b + "10:15-11:15",r + "SINF",v+"PROG",r + "SINF",v+"PROG",n + "ED");
    System.out.println("11:15-11:45  ---------------RECREO-------------------");
    System.out.printf("%-11s  %-6s    %-6s     %-6s       %-6s     %-6s\n",b + "11:45-12:40",a + "FOL",m+"BBDD",n + "ED",m+"BBDD",b + "LM");
    System.out.printf("%-11s  %-6s    %-6s     %-6s       %-6s     %-6s\n",b + "12:40-13:35",a + "FOL",m+"BBDD",n + "ED",m+"BBDD",b + "LM");
    System.out.printf("%-11s  %-6s    %-6s     %-6s       %-6s     %-6s\n",b + "13:35-14:30",a + "FOL",m+"BBDD",b + "LM",m+"BBDD",b + "LM");

    
  
  }
}

