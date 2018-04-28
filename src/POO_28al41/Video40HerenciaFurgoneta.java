/*
 * Este ejemplo hereda de la clase Video28Coche.java, la herencia en java
 * se hace mediante la palabra reservada extends.
 */
package POO_28al41;
public class Video40HerenciaFurgoneta extends Video28Coche {
    private int capacidad_carga;
    private int plazas_extra;

    public Video40HerenciaFurgoneta(int plazas_extra, int capacidad_carga) {
        //super ejecuta el constructro de la clase padre, 
        super();
        this.capacidad_carga=capacidad_carga;
        this.plazas_extra=plazas_extra;       
    }
    
    public String getDatosFurgoneta(){
        return "La capacidad de carga es: "+this.capacidad_carga+" Y las plzasas disponibles son: "+this.capacidad_carga;
    }
    public int getCapacidad_carga() {
        return capacidad_carga;
    }

    public void setCapacidad_carga(int capacidad_carga) {
        this.capacidad_carga = capacidad_carga;
    }

    public int getPlazas_extra() {
        return plazas_extra;
    }

    public void setPlazas_extra(int plazas_extra) {
        this.plazas_extra = plazas_extra;
    }
    
   
}
