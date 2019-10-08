package Video51InterfacesII;
//en las interfaces los métodos solo se definen, no se desarrollan.

public interface trabajadores {

    double setBonus(double gratificacion);
    //las constantes de las interfaces son sotas public static y final, por lo
    //cuál podemos omitir eso en la declaracion
    public static final double bonus_base = 1500;
}
