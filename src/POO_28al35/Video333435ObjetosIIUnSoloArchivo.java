
package POO_28al35;

import java.util.Date;
import java.util.GregorianCalendar;

public class Video333435ObjetosIIUnSoloArchivo {

    public static void main(String[] args) {
//        Empleado empleado1= new Empleado("Paco Gómez", 85000, 1990, 12, 17);
//        Empleado empleado2= new Empleado("Patricio Gómez", 95000, 1995, 06, 02);
//        Empleado empleado3= new Empleado("Máría Martín", 105000, 2002, 03, 15);
//        empleado1.setSueldo(5);
//        empleado2.setSueldo(5);
//        empleado3.setSueldo(5);
//        System.out.println("nombre: "+empleado1.getNombre()+" Sueldo: "+empleado1.getSueldo()
//        +" Feca de alta: "+empleado1.getFechaContrato());
//        System.out.println("nombre: "+empleado2.getNombre()+" Sueldo: "+empleado2.getSueldo()
//        +" Feca de alta: "+empleado2.getFechaContrato());
//        System.out.println("nombre: "+empleado3.getNombre()+" Sueldo: "+empleado3.getSueldo()
//        +" Feca de alta: "+empleado3.getFechaContrato());

          Empleado[] misEmpleados=new Empleado[3];
          misEmpleados[0]= new Empleado("Paco Gómez", 85000, 1990, 12, 17);
          misEmpleados[1]= new Empleado("Patricio Gómez", 95000, 1995, 06, 02);
          misEmpleados[2]= new Empleado("Máría Martín", 105000, 2002, 03, 15);
          
//          for(int i =0; i<3;i++){
//              misEmpleados[i].setSueldo(5);
//          }
//          
//          for(int i =0; i<3;i++){
//             System.out.println("Nombre: "+misEmpleados[i].getNombre()+" Sueldo: "
//             +misEmpleados[i].getSueldo()+" Fecha alta; "+misEmpleados[i].getFechaContrato());
//          }
          for(Empleado e:misEmpleados){
              e.setSueldo(5);
          }
          
          for(Empleado e:misEmpleados){
             System.out.println("Nombre: "+e.getNombre()+" Sueldo: "
             +e.getSueldo()+" Fecha alta; "+e.getFechaContrato());
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