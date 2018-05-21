package POO_28al46;

import java.util.Date;
import java.util.GregorianCalendar;

public class Video4546AbstractClass {

    public static void main(String[] args) {
       Persona[] lasPersonas=new Persona[2];
       lasPersonas[0]=new Empleados45("Marcos", 50000, 2009, 10, 10, "Uno");
       lasPersonas[1]=new Alumno("Pedro", "Ingeniería en Informática");
       
       for(Persona persona:lasPersonas ){
           System.out.println(persona.getNombre()+" "+persona.getDescripcion());
       }
       
    }
    
}

abstract class Persona{
    private String nombre;
    public Persona(String nom){
        nombre = nom;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public abstract String getDescripcion();
}

class Empleados45 extends Persona{
    
    public Empleados45(String nom,  double sue, int agno, int mes, int dia,String seccion){
       super(nom);
        this.sueldo=sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendario.getTime();
        this.seccion=seccion;
        Id=IdSiguiente;
        IdSiguiente++;
    }
    public Empleados45(String nom){
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
    
    private String seccion;
    private double sueldo;
    private int agno;
    private int mes;
    private int dia;
    private Date altaContrato;
    private int Id;
    private static int IdSiguiente=1;

    @Override
    public String getDescripcion() {
        return "Este empleado tiene un id= "+Id+" con un sueldo= "+ sueldo;
    }
}

class Alumno extends Persona{
    private String carrera;
    public Alumno(String nom, String car) {
        super(nom);
        this.carrera=car;
    }

    @Override
    public String getDescripcion() {
        return "Este alumno está estudiando la carrera de "+this.carrera;
    }

}