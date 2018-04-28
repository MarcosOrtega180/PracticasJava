
package POO_28al35;
import javax.swing.*;
public class Video30UsoCocheGettersySetters {

    public static void main(String[] args) {
        Video28Coche miCoche=new Video28Coche();
        
        miCoche.setColor(JOptionPane.showInputDialog("Introduzca un color"));
        miCoche.setAsientosCuero(JOptionPane.showInputDialog("Tiene asientos de cuero?")); 
        miCoche.setClimatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
        
        
        System.out.println(miCoche.getMany());
        System.out.println("El color del coche es "+ miCoche.getColor()+"  ");       
        System.out.println(miCoche.getAsientos());
        System.out.println(miCoche.getClimatizador());
        System.out.println(miCoche.setGetPeso());
        System.out.println("El precio final del coche es "+miCoche.setGetPrecioCoche());
        
        
    }
    
}
