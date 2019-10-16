package Video52InterfacesIITemporizador;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
// los pasos están indicados por números 1), 2), 3)...; se recomienda leer los comentarios en orden.
// esta aplicación ejecuta una impresión cada determinado tiempo, específicamente 5 esgundos
class PruebaTemporizador1 {
    public static void main(String[] args) {
        /* aquí instanciamos la clase DameLaHora en el ejeplar oyente, la clase DameLaHora extiende la interfaz
        * ActionListener, por lo cual el ejemplar oyente es aceptado como parámetro en 1) */
        DameLaHora1 oyente = new DameLaHora1();

        /* 1) esta es la parte principal, la creación de un Timer el cual requiere que sean rellenados dos parametros para
        * ser creado con éxito, estos valores son un tiempo en milisegundos, cada vez que pase este tiempo se ejecutará
        * una acción. El segundo parametro debe ser un listener de tipo ActionListener, en este caso oyente*/
        Timer miTemporizador = new Timer(5000, oyente);

        // 6) uno de los métodos propios de la clase Timer es start(), lo que hace es iniciar la ejecución del timer
        miTemporizador.start();

        /* 7) Esto muestra un mensaje con un botón ok, al presionarse el botón, esta ventana se cierra y se ejecuta la
        * última instrucción para detener el programa*/
        JOptionPane.showMessageDialog(null,"Pulsa aceptar para detener.");
        // esto hace que se cierre el programa
        System.exit(0);
    }
}

/* 3) Hay que recordar que las interfaces no pueden ser instnciadas directamente, por ello hay que crear una clase para
* extender la interfaz en primer lugar, eso es lo que observamos abajo.*/
class DameLaHora1 implements ActionListener{
    /* 4) el método actionPerformed es propio de la interfaz ActionListener, nos vemos obligados a aplicarlo, desde un
    * principio el que un parametro de Timer sea una interfaz ActionListener era que se implemente este método propio de
    * la interfaz ActionListener*/
    @Override
    public void actionPerformed(ActionEvent e) {
        /* 5) ahora instanciamos Date en un ejmplar para obtener los datos de Date cada vez que pase el tiempo del timer,
        * en sintesis, el actionPerformed es donde se especifíca qué se hará cada vez que se cumpla el timpo del timer.
        * Después de obtenerse los datos, estos son imprimidos */
        Date ahora= new Date();
        System.out.println("Te pongo la hora cada 5 sg: "+ ahora);
    }
}
