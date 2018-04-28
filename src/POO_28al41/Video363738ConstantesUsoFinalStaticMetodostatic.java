package POO_28al41;
public class Video363738ConstantesUsoFinalStaticMetodostatic {
    public static void main(String[] args) {
        Empleados trabajador1=new Empleados("Pablo");
        Empleados trabajador2=new Empleados("Ana");
        Empleados trabajador3=new Empleados("Antonio");
        Empleados trabajador4=new Empleados("Corina María");
        trabajador1.setSeccion("RRHH");
        System.out.println(
            trabajador1.getDatos()+"\n"+
            trabajador2.getDatos()+"\n"+
            trabajador3.getDatos()+"\n"+
            trabajador4.getDatos()
        );
        System.out.println("El IdSiguiente es: "+Empleados.getIdSiguiente());
    }
    
}

class Empleados{
    public Empleados(String nom){
        nombre=nom;
        seccion="Administración";
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
        return "El nombre es: "+this.nombre+" y la sección es "+this.seccion+" y el id = "+this.Id;
    }
    public static String getIdSiguiente(){
        return "El IdSiguiente es: "+IdSiguiente;
    }
    //final define una constante
    private final String nombre;
    private String seccion;
    private int Id;
    private static int IdSiguiente=1;
}