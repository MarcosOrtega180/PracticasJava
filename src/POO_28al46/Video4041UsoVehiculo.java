
package POO_28al46;
public class Video4041UsoVehiculo {
    public static void main(String[] args) {
        Video28Coche micoche1=new Video28Coche();
        micoche1.setColor("Rojo");
        
        Video40HerenciaFurgoneta miFurgoneta1=new Video40HerenciaFurgoneta(7, 580);
        miFurgoneta1.setColor("azul");
        miFurgoneta1.setAsientosCuero("sí");
        miFurgoneta1.setClimatizador("sí");
        System.out.println(micoche1.getMany()+" "+micoche1.getColor());
        System.out.println(miFurgoneta1.getMany()+" "+miFurgoneta1.getColor()
        +" "+miFurgoneta1.getDatosFurgoneta());
    }
    
}
