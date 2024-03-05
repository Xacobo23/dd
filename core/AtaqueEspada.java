package core;

public class AtaqueEspada implements Ataque{
    static private int daño = 100;
    public int atacar() {
        return  (int) (Math.random() * daño * (int)(Math.random()*2));
    }
    public String getNombre() {
        return "una espada";
    }

    @Override
    public String toString() {
        return getNombre();
    }

}
