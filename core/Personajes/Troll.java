package core.Personajes;

import core.AtaqueArco;
import core.AtaqueEspada;
import core.AtaqueCuchillo;
import core.Personaje;

public class Troll extends Personaje {
    static private int salud = 1000;
    static private int numAtaques = 1;

    public Troll(String nombre) {
        super(nombre, salud, numAtaques);

        switch ((int) (Math.random() * 3 + 1)) {
            case 1:
                setAtaque(new AtaqueEspada());
                break;
            case 2:
                setAtaque(new AtaqueArco());
                break;
            case 3:
                setAtaque(new AtaqueCuchillo());
                break;
            default:
                setAtaque(new AtaqueEspada());
                break;
        }
    }
}
