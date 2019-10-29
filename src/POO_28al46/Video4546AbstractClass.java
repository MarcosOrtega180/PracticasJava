package POO_28al46;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
/*las clases abstractas son las clases más básicas o superiores en el arbol de herencia (clases super-padre)
* */
public class Video4546AbstractClass {

    public static void main(String[] args) {
        Persona[] lasPersonas = new Persona[6];
        lasPersonas[0] = new Empleados45("Marcos", 50000, 2009, 10, 10, "Uno");
        lasPersonas[1] = new Empleados45("Juan", 50000, 2009, 10, 10, "Tres");
        lasPersonas[2] = new Empleados45("Pedro", 50000, 2009, 10, 10, "Dos");
        lasPersonas[3] = new Empleados45("Arístides", 50000, 2009, 10, 10, "Cinco");
        lasPersonas[4] = new Empleados45("Mendieta", 50000, 2009, 10, 10, "Diez");
        lasPersonas[5] = new Alumno("Pedro", "Ingeniería en Informática");

        Arrays.sort(lasPersonas);
        for (Persona persona : lasPersonas) {
            System.out.println(persona.getNombre() + " " + persona.getDescripcion());
        }

    }

}

//una clase abstrac es una clase básica, que posee propiedades y métodos que 
//pueden ser heredados para varias clases más. Esto se hace para crear patrones
//de diseño. 
abstract class Persona {

    private String nombre;

    public Persona(String nom) {
        nombre = nom;
    }

    public String getNombre() {
        return nombre;
    }
    //los métodos abstract solo se definen pero no se contruyen, debido a que supone que
    //necesariamente deben existeir a las clases que hereden de la clase persona
    //pero el contenido de método puede ser diferente entre las diferentes
    //clases que heredan de la clase, por ello están vacíos ya que se debe definir
    //su contenído específico dentro de cada clase hijo que esté heredando.

    // concepto: Una clase abstracta es la que marca el di diseño de la gerarquía de la erencia.
    public abstract String getDescripcion();
}

class Empleados45 extends Persona {

    public Empleados45(String nom, double sue, int agno, int mes, int dia, String seccion) {
        super(nom);
        this.sueldo = sue;
                 GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();
        this.seccion = seccion;
        Id = IdSiguiente;
        IdSiguiente++;
    }

    public Empleados45(String nom) {
        this(nom, 30000, 2000, 01, 01, "Pasantes");
        Id = IdSiguiente;
        IdSiguiente++;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void setNombre(String nombre) {
//        this.nombre=nombre;
    }

    public String getDatos() {
        return "La sección es " + this.seccion + " y el id = " + this.Id;
    }

    public String getSeccion() {
        return ", sección: " + this.seccion;
    }

    public String getId() {
        return "Id = " + this.Id;
    }

//    public Empleado(String nom){
//        this(nom,30000,2000,01,01);
//    } 
    public double getSueldo() {
        return this.sueldo;
    }

    public Date getFechaContrato() {
        return this.altaContrato;
    }

    public void setSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }

    public static String getIdSiguiente() {
        return "El IdSiguiente es: " + IdSiguiente;
    }
    //final define una constante

    private String seccion;
    private double sueldo;
    private int agno;
    private int mes;
    private int dia;
    private Date altaContrato;
    private int Id;
    private static int IdSiguiente = 1;

    @Override
    public String getDescripcion() {
        return "Este empleado tiene un id= " + Id + " con un sueldo= " + sueldo;
    }
}

class Alumno extends Persona {

    private String carrera;

    public Alumno(String nom, String car) {
        super(nom);
        this.carrera = car;
    }

    @Override
    public String getDescripcion() {
        return "Este alumno está estudiando la carrera de " + this.carrera;
    }

}
