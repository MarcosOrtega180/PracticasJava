package POO_28al46.Video50InterfacesII;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class UsoInterfaces50 {
    public static void main(String[] args) {
    JefaturaI50 jefe = new JefaturaI50("Carlos Pezzino", 1000, 10, 10, 10, "Jefatura44");
        jefe.setIncentivo(1000);
        EmpleadosI50[] misEmpleados = new EmpleadosI50[6];
        misEmpleados[0] = new EmpleadosI50("Paco Gómez", 85000, 1990, 12, 17, "Finanzas");
        misEmpleados[1] = new EmpleadosI50("Patricio Gómez", 95000, 1995, 06, 02, "Atención al cliente");
        misEmpleados[2] = new EmpleadosI50("Máría Martín", 105000, 2002, 03, 15, "Servicio Técnico");
        misEmpleados[3] = new EmpleadosI50("Marcos Ortega");
        misEmpleados[4] = jefe; //Polimorfismo en acción. Principio de sustitución
        misEmpleados[5] = new JefaturaI50("María", 5500, 2011, 10, 27, "Ventas");
        //esto es un casting de objetos, esto tb se hace con tipos de variables primitivas
        JefaturaI50 jefa_Finanzas = (JefaturaI50) misEmpleados[5];
        jefa_Finanzas.setIncentivo(5000000);
        misEmpleados[1].setSeccion("RRHH");
       
        System.out.println(jefa_Finanzas.tomar_decisiones("Aumentar Salario."));
        for (EmpleadosI50 e : misEmpleados) {
            e.setSueldo(5);
        }
        
        Arrays.sort(misEmpleados);
        for (EmpleadosI50 e : misEmpleados) {
            System.out.println(e.getId() + " Nombre: " + e.getNombre() + e.getSeccion() + " Sueldo: "
                    + e.getSueldo() + " Fecha alta; " + e.getFechaContrato());
        }

//        System.out.println(jefe.getId()+" Nombre: "+jefe.getNombre()+jefe.getSeccion()+" Suedo: "
//        +jefe.getSueldo()+" Fecha alta "+ jefe.getFechaContrato());
        System.out.println("El IdSiguiente es: " + EmpleadosI50.getIdSiguiente());
    }
}

class EmpleadosI50 implements Comparable{

    public EmpleadosI50(String nom, double sue, int agno, int mes, int dia, String seccion) {
        this.nombre = nom;
        this.sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();
        this.seccion = seccion;
        Id = IdSiguiente;
        IdSiguiente++;
    }

    public EmpleadosI50(String nom) {
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
        EmpleadosI50 otroEmpleado = (EmpleadosI50) miObjeto;
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

class JefaturaI50 extends EmpleadosI50 implements Jefes{

    public JefaturaI50(String nom, double sue, int agno, int mes, int dia, String seccion) {
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

    @Override
    public String tomar_decisiones(String decision) {
        return "Un miembro de la dirección ha tomado la decisión de: "+decision;
    }
}
