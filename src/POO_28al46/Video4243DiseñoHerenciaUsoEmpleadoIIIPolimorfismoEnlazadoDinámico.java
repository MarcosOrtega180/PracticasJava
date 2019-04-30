/*practica de diseño con clases */
package POO_28al46;

import java.util.Date;
import java.util.GregorianCalendar;
//si yo pongo final frente a una clase lo que hago es decir que ninguna otra clase
//puede heredar de dicha clase. Lo mismo pasa con los métodos
public class Video4243DiseñoHerenciaUsoEmpleadoIIIPolimorfismoEnlazadoDinámico {

    public static void main(String[] args) {
        //creación de un objeto de la subClase Jefatura
        Jefatura jefe = new Jefatura("Carlos Pezzino", 1000, 10, 10, 10, "Jefatura");
        jefe.setIncentivo(1000);

        Empleados42[] misEmpleados = new Empleados42[6];
        misEmpleados[0] = new Empleados42("Paco Gómez", 85000, 1990, 12, 17, "Finanzas");
        misEmpleados[1] = new Empleados42("Patricio Gómez", 95000, 1995, 06, 02, "Atención al cliente");
        misEmpleados[2] = new Empleados42("Máría Martín", 105000, 2002, 03, 15, "Servicio Técnico");
        misEmpleados[3] = new Empleados42("Marcos Ortega");
        //Polimorfismo en acción. Principio de sustitución: Se puede usar un objeto
        //de la subclase siempre que el programa espere un objeto de la super clase.
        misEmpleados[4] = jefe; //jefe es una subclase y misEmpleados[4] espera a clase padre
        misEmpleados[5] = new Jefatura("María", 5500, 2011, 10, 27, "Ventas");
        
        //casting, esto solo puede funcionar si el ejemplar de clase responde a 
        //la regla del ES UN?
        Jefatura jefa_finanzas=(Jefatura) misEmpleados[5];
        jefa_finanzas.setIncentivo(-50000000);
        jefa_finanzas.setNombre("Juanita juanita juanita");

        misEmpleados[1].setSeccion("RRHH");
        for (Empleados42 e : misEmpleados) {
            e.setSueldo(5);
        }
        //Enlazado dinámico: la máquina virtual de java permite que el programa
        //determine a cuál clase llamar cuando el polimorfismo se da.
        for (Empleados42 e : misEmpleados) {
            System.out.println(e.getId() + " Nombre: " + e.getNombre() + e.getSeccion() + " Sueldo: "
                    + e.getSueldo() + " Fecha alta; " + e.getFechaContrato());
        }

//        System.out.println(jefe.getId()+" Nombre: "+jefe.getNombre()+jefe.getSeccion()+" Suedo: "
//        +jefe.getSueldo()+" Fecha alta "+ jefe.getFechaContrato());
        System.out.println("El IdSiguiente es: " + Empleados.getIdSiguiente());
    }
    //final define una constante

}

class Empleados42 {

    public Empleados42(String nom, double sue, int agno, int mes, int dia, String seccion) {
        this.nombre = nom;
        this.sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();
        this.seccion = seccion;
        Id = IdSiguiente;
        IdSiguiente++;
    }

    public Empleados42(String nom) {
        this(nom, 30000, 2000, 01, 01, "Pasantes");
        Id = IdSiguiente;
        IdSiguiente++;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void setNombre(String nombre) {
       this.nombre=nombre;
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
//    Esto evita el @override de los métodos
    //final public double getSueldo() {
//        return this.sueldo;
//    }

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
//    private final String nombre;
    private String nombre;
    private String seccion;
    private double sueldo;
    private int agno;
    private int mes;
    private int dia;
    private Date altaContrato;
    private int Id;
    private static int IdSiguiente = 1;
}

class Jefatura extends Empleados42 {

    public Jefatura(String nom, double sue, int agno, int mes, int dia, String seccion) {
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
