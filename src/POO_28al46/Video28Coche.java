
package POO_28al46;

public class Video28Coche {
    //estas son las propiedades encapsuladas
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;//se especifíca la capacidad
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientosCuero, climatizador;
    //método constructor
    //el método constructor tiene que tener el mismo nombre de la clase
    public Video28Coche(){
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        peso_plataforma=500;
        
    }
    public String getMany(){
        String peso = "500";
        return "La plataforma del ehículo tiene "+ruedas+" ruedas "
                + ""+ ". Mide "+largo/1000+" metros con un ancho de "+
                ancho+" cm y un peso de platafoma de "+ peso + " kg";
    }
    String getLargo(){
        return "El largo del coche es "+ largo;
    }
    
    void setColor(String colorIn){
        color=colorIn;      
    }
    public String getColor(){
       return color;     
    }
    public void setAsientosCuero(String asientosCuero){
        if(asientosCuero.equalsIgnoreCase("sí")){
            this.asientosCuero=true;
        }else{
            this.asientosCuero=false;
        }
    }
    public String getAsientos(){
        if(this.asientosCuero==true){
            return "El choche tiene asientos de cuero";
        }else{
            return "El coche tiene asientos de serie.";
        }        
    }
//    clmatizador
    public void setClimatizador(String climatizador){
        if(climatizador.equalsIgnoreCase("sí")){
            this.climatizador=true;
        }else{
            this.climatizador=false;
        }
    }
    public String getClimatizador(){
        if(this.climatizador==true){
            return "El coche incorpora climatizador";
        }else{
            return "El coche lleva aire acondicionado";
        }
    }
    
    //peso (metodo que es getter y setter a la vez), porque establece un valor y lo modifica a lavez
    //esta prácica no es recomendada
    public String setGetPeso(){
        int peso_carroceria=500;
        this.peso_total=this.peso_total+peso_carroceria;
        if(asientosCuero==true){
            this.peso_total=this.peso_total+50;
        }
        if(this.climatizador==true){
            this.peso_total=this.peso_total+20;
        }
        return "El peso del choche es "+this.peso_total;
    }
    
    //determinar precio final
    //este también es un método seter y geter
    public int setGetPrecioCoche(){
        int precio_final=10000;
        if(this.asientosCuero==true){
            precio_final+=2000;
        }
        if(this.climatizador==true){
            precio_final+=1500;
        }
        return precio_final;
    }
}
