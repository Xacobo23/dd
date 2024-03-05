package core;

public class AtaqueArco implements Ataque{
    static private int daño = 50;
    public int atacar() {
        return  (int) (Math.random() * daño * (int)(Math.random()*2));
    }
    public String getNombre() {
        return "un arco";
    }

    @Override
    public String toString() {
        return getNombre();
    }
}
