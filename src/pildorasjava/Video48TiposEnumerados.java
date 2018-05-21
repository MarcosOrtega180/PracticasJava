//(1)primer ejemplo
package pildorasjava;

import java.util.Scanner;

public class Video48TiposEnumerados {
    //(1)enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};
    
    enum Talla{
        MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
        private String abreviatura;
        private Talla(String abreviatura){
            this.abreviatura=abreviatura;
        }
        
        public String getAbreviatura(){
            return abreviatura;
        }
    }
    public static void main(String[] args) {
        //para aquellas variables en las cuales se puede cargar
        //ciertos valores determinados
        //(1)Talla s=Talla.MINI;
        //(1)Talla m=Talla.MEDIANO;
        //(1)Talla l=Talla.GRANDE;
        //(1)Talla xl=Talla.MUY_GRANDE;
        
        Scanner entrada= new Scanner(System.in);
        System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE ");
        String entrada_datos=entrada.next().toUpperCase();
        
        Talla la_talla= Enum.valueOf(Talla.class, entrada_datos);
       
        System.out.println("Talla= "+ la_talla);
        System.out.println("Abreviatura= "+ la_talla.getAbreviatura());
    }
    
}
