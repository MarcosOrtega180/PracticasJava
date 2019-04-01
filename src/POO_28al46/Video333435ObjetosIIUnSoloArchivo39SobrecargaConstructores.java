
package POO_28al46;

import java.util.Date;
import java.util.GregorianCalendar;

public class Video333435ObjetosIIUnSoloArchivo39SobrecargaConstructores {

    public static void main(String[] args) {

          Empleado[] misEmpleados=new Empleado[4];
          
          misEmpleados[0]= new Empleado("Paco Gómez", 85000, 1990, 12, 17);
          misEmpleados[1]= new Empleado("Patricio Gómez", 95000, 1995, 06, 02);
          misEmpleados[2]= new Empleado("Máría Martín", 105000, 2002, 03, 15);
          misEmpleados[3]= new Empleado("Marcos Ortega");
          
          for(Empleado item:misEmpleados){
              item.setSueldo(5);
          }
          
          for(Empleado item:misEmpleados){
             System.out.println("Nombre: "+item.getNombre()+" Sueldo: "
             +item.getSueldo()+" Fecha alta; "+item.getFechaContrato());
          }
    }
    
}
//solo la clase principal puede ser public y tener main metod
class Empleado{
    //el método constructor simpre tiene que ser public
    public Empleado(String nom,  double sue, int agno, int mes, int dia){
        this.nombre=nom;
        this.sueldo=sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendario.getTime();
       
    }
    public Empleado(String nom){
        this(nom,30000,2000,01,01);
    } 
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
    
    
    private String nombre;
    private double sueldo;
    private Date altaContrato;
}