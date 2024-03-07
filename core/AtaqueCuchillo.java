package core;

public class AtaqueCuchillo implements Ataque{
    private int daño = 25;
    public int atacar() {
        return  (int) (Math.random() * daño * (int)(Math.random()*2));
    }
    public String getNombre() {
        return "un cuchillo";
    }
    @Override
    public String toString() {
        return getNombre();
    }

}
