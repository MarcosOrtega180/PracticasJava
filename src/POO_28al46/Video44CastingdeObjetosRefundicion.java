/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO_28al46;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author maros
 */
public class Video44CastingdeObjetosRefundicion {

    
    public static void main(String[] args) {

        Jefatura44 jefe = new Jefatura44("Carlos Pezzino", 1000, 10, 10, 10, "Jefatura44");
        jefe.setIncentivo(1000);
        Empleados44[] misEmpleados=new Empleados44[6];
        misEmpleados[0]=new Empleados44("Paco Gómez", 85000, 1990, 12, 17,"Finanzas");
        misEmpleados[1]=new Empleados44("Patricio Gómez", 95000, 1995, 06, 02,"Atención al cliente");
        misEmpleados[2]=new Empleados44("Máría Martín", 105000, 2002, 03, 15,"Servicio Técnico");
        misEmpleados[3]=new Empleados44("Marcos Ortega");
        misEmpleados[4]=jefe; //Polimorfismo en acción. Principio de sustitución
        misEmpleados[5]=new Jefatura44("María", 5500, 2011, 10, 27, "Ventas");

        //esto es un casting de objetos, esto tb se hace con tipos de variables primitivas
        Jefatura44 jefa_Finanzas=(Jefatura44) misEmpleados[5];

        jefa_Finanzas.setIncentivo(5000000);
        misEmpleados[1].setSeccion("RRHH");

        for(Empleados44 e:misEmpleados){
              e.setSueldo(5);
          }          
        for(Empleados44 e:misEmpleados){
           System.out.println(e.getId()+" Nombre: "+e.getNombre()+e.getSeccion()+" Sueldo: "
           +e.getSueldo()+" Fecha alta; "+e.getFechaContrato());
        }
        
//        System.out.println(jefe.getId()+" Nombre: "+jefe.getNombre()+jefe.getSeccion()+" Suedo: "
//        +jefe.getSueldo()+" Fecha alta "+ jefe.getFechaContrato());
        System.out.println("El IdSiguiente es: "+Empleados.getIdSiguiente());
    }
    
}

class Empleados44{
    
    public Empleados44(String nom,  double sue, int agno, int mes, int dia,String seccion){
        this.nombre=nom;
        this.sueldo=sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendario.getTime();
        this.seccion=seccion;
        Id=IdSiguiente;
        IdSiguiente++;
    }
    public Empleados44(String nom){
        this(nom,30000,2000,01,01,"Pasantes");
        Id=IdSiguiente;
        IdSiguiente++;
    }
    
    public void setSeccion(String seccion){
        this.seccion=seccion;
    }
    public void setNombre(String nombre){
//        this.nombre=nombre;
    }
    
    public String getDatos(){
        return "La sección es "+this.seccion+" y el id = "+this.Id;
    }
    public String getSeccion(){
        return ", sección: "+this.seccion;
    }
    public String getId(){
        return "Id = "+this.Id;
    }
    
//    public Empleado(String nom){
//        this(nom,30000,2000,01,01);
//    } 
    public String getNombre(){
        return this.nombre;
    }
    public double getSueldo(){
        return this.sueldo;
    }
    public Date getFechaContrato(){
        return this.altaContrato;
    }
    public void setSueldo(double porcentaje){
        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;
    }
    public static String getIdSiguiente(){
        return "El IdSiguiente es: "+IdSiguiente;
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
    private static int IdSiguiente=1;
}

class Jefatura44 extends Empleados44{

    public Jefatura44(String nom, double sue, int agno, int mes, int dia, String seccion) {
        super(nom, sue, agno, mes, dia, seccion);        
    }
    //es un extra que se le da solo a los jefes
    private double incentivo;
    public void setIncentivo(double incentivo){
        this.incentivo=incentivo;
    }    
    //calculamos el nuevo sueldo correspondiente al jefe, agregando en incentivo
    @Override
    public double getSueldo(){
        double sueldoJefe= super.getSueldo();
        return sueldoJefe+incentivo;
    }
}
