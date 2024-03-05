package core.Personajes;

import core.Personaje;

public class Caballero extends Personaje{
    static private int salud = 1500;
    static private int numAtaques = 2;

    public Caballero(String nombre) {
        super(nombre, salud, numAtaques);
    }
}
