package core.Personajes;

import core.Personaje;

public class Troll extends Personaje {
    static private int salud = 1000;
    static private int numAtaques = 1;

    public Troll(String nombre) {
        super(nombre, salud, numAtaques);
    }
}
