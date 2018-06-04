package POO_28al46;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Video5051Interfaces {

    public static void main(String[] args) {
        Jefatura50 jefe = new Jefatura50("Carlos Pezzino", 1000, 10, 10, 10, "Jefatura44");
        jefe.setIncentivo(1000);
        Empleados50[] misEmpleados = new Empleados50[6];
        misEmpleados[0] = new Empleados50("Paco Gómez", 85000, 1990, 12, 17, "Finanzas");
        misEmpleados[1] = new Empleados50("Patricio Gómez", 95000, 1995, 06, 02, "Atención al cliente");
        misEmpleados[2] = new Empleados50("Máría Martín", 105000, 2002, 03, 15, "Servicio Técnico");
        misEmpleados[3] = new Empleados50("Marcos Ortega");
        misEmpleados[4] = jefe; //Polimorfismo en acción. Principio de sustitución
        misEmpleados[5] = new Jefatura50("María", 5500, 2011, 10, 27, "Ventas");
        //esto es un casting de objetos, esto tb se hace con tipos de variables primitivas
        Jefatura50 jefa_Finanzas = (Jefatura50) misEmpleados[5];
        jefa_Finanzas.setIncentivo(5000000);
        misEmpleados[1].setSeccion("RRHH");
        Empleados50 director_comercial = new Jefatura50("Sandra", 85000, 2012, 05, 05, "Credenciales");
        Comparable ejemplo=new Empleados50("Pedro", 2015, 01, 01, 01, "Atención al cliente");
        
        
        //como comprovar si una instancia pertenece a una clase o no
        if(director_comercial instanceof Empleados50){
            System.out.println("Es de tipo Jefatura");
        }
        
        if(ejemplo instanceof Comparable){
            System.out.println("Implementa la interfaz comparable");
        }
        
        for (Empleados50 e : misEmpleados) {
            e.setSueldo(5);
        }
        
        Arrays.sort(misEmpleados);
        for (Empleados50 e : misEmpleados) {
            System.out.println(e.getId() + " Nombre: " + e.getNombre() + e.getSeccion() + " Sueldo: "
                    + e.getSueldo() + " Fecha alta; " + e.getFechaContrato());
        }

//        System.out.println(jefe.getId()+" Nombre: "+jefe.getNombre()+jefe.getSeccion()+" Suedo: "
//        +jefe.getSueldo()+" Fecha alta "+ jefe.getFechaContrato());
        System.out.println("El IdSiguiente es: " + Empleados.getIdSiguiente());
    }
}

class Empleados50 implements Comparable{

    public Empleados50(String nom, double sue, int agno, int mes, int dia, String seccion) {
        this.nombre = nom;
        this.sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();
        this.seccion = seccion;
        Id = IdSiguiente;
        IdSiguiente++;
    }

    public Empleados50(String nom) {
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
    public String getNombre() {
        return this.nombre;
    }

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

    public int compareTo(Object miObjeto) {
        Empleados50 otroEmpleado = (Empleados50) miObjeto;
        if (this.Id < otroEmpleado.Id) {
            return -1;
        }if (this.Id > otroEmpleado.Id) {

            return 1;

        }else{
            return 0;
        }
    }
    //final define una constante
    private final String nombre;
    private String seccion;
    private double sueldo;
    private int agno;
    private int mes;
    private int dia;
    private Date altaContrato;
    private int Id;
    private static int IdSiguiente = 1;
}

class Jefatura50 extends Empleados50 {

    public Jefatura50(String nom, double sue, int agno, int mes, int dia, String seccion) {
        super(nom, sue, agno, mes, dia, seccion);
    }
    //es un extra que se le da solo a los jefes
    private double incentivo;

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }
    //calculamos el nuevo sueldo correspondiente al jefe, agregando en incentivo

    @Override
    public double getSueldo() {
        double sueldoJefe = super.getSueldo();
        return sueldoJefe + incentivo;
    }
}
