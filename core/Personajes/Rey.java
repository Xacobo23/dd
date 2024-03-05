package core.Personajes;

import core.Personaje;

public class Rey extends Personaje {
    static private int salud = 2000;
    static private int numAtaques = 3;

    public Rey(String nombre) {
        super(nombre, salud, numAtaques);
    }
}
