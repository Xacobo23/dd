package core;

public class Personaje {
    private String nombre;
    private int salud;
    private int numAtaques;
    private Ataque ataque;

    public Personaje(String nombre, int salud, int ataque) {
        this.nombre = nombre;
        this.salud = salud;
        this.ataque = new AtaqueEspada();
    }

    public String getNombre() {
        return nombre;
    }
    public int getSalud() {
        return salud;
    }
    public int getNumAtaques() {
        return numAtaques;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSalud(int salud) {
        this.salud = salud;
    }
    public void setNumAtaques(int numAtaques) {
        this.numAtaques = numAtaques;
    }
    public void setAtaque(Ataque ataque) {
        this.ataque = ataque;
    }
    public Ataque getAtaque() {
        return ataque;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}
