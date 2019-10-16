package FechasYHoras;

import java.time.LocalDate;

public class Fechas {
    public static void main(String[] args){
//        obtenemos la fecha de hoy
        LocalDate today = LocalDate.now();
        LocalDate otraFecha= LocalDate.of(2019,10,16);
        System.out.println(today);
        System.out.println(otraFecha);
    }
}
