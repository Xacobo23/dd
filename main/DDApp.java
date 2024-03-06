package main;

import core.Personajes.Caballero;
import core.Personajes.Rey;
import core.Personajes.Troll;
import core.Personaje;
import core.AtaqueArco;
import core.AtaqueCuchillo;
import core.AtaqueEspada;
import java.util.ArrayList;

public class DDApp {
    public static void main(String[] args) {
        int daño;
        ArrayList<Personaje> humanos = new ArrayList<>();
        humanos.add(new Rey("Rey Arturo"));
        humanos.get(0).setAtaque(new AtaqueEspada());
        humanos.add(new Caballero("Lancelot"));
        humanos.get(1).setAtaque(new AtaqueEspada());
        humanos.add(new Caballero("Percival"));
        humanos.get(2).setAtaque(new AtaqueArco());

        ArrayList<Personaje> monstruos = new ArrayList<>();

        for (int i = 0; i < Math.random() * (9) + 2; i++) {
            monstruos.add(new Troll("Troll " + (i + 1)));
        }
        while (humanos.size() > 0 && monstruos.size() > 0) {
            // ataque humanos
            for (int i = 0; i < humanos.size(); i++) {
                int randomTroll = (int) (Math.random() * monstruos.size());
                try {
                    Personaje troll = monstruos.get(randomTroll);
                    AtaqueEspada ataqueEspada = new AtaqueEspada();
                    AtaqueArco ataqueArco = new AtaqueArco();
                    if (i == 0) {
                        int n = 0;
                        System.out.println(humanos.get(i).getNombre() + " ataca a " + troll.getNombre() + " con " + humanos.get(i).getAtaque());
                        while (n != 3) {
                            daño = ataqueEspada.atacar();
                            if(daño == 0){  
                                System.out.println("[" + troll.getSalud() + "]" + "-" + "[falla] = ["+ (troll.getSalud() - daño) + "]");
                                troll.setSalud(troll.getSalud() - daño);
                                n++;
                            }else{
                                System.out.println("[" + troll.getSalud() + "]" + "-" + "[" + daño + "] = ["+ (troll.getSalud() - daño) + "]");
                                troll.setSalud(troll.getSalud() - daño);
                                n++;
                            }
                        }
                    }
                    if (i == 1) {
                        int n = 0;
                        System.out.println(humanos.get(i).getNombre() + " ataca a " + troll.getNombre() + " con "+ humanos.get(i).getAtaque());
                        while (n != 2) {
                            daño = ataqueEspada.atacar();
                            if(daño == 0){
                                System.out.println("[" + troll.getSalud() + "]" + "-" + "[falla] = ["+ (troll.getSalud() - daño) + "]");
                                troll.setSalud(troll.getSalud() - daño);
                                n++;
                            }else{
                                System.out.println("[" + troll.getSalud() + "]" + "-" + "[" + daño + "] = ["+ (troll.getSalud() - daño) + "]");
                                troll.setSalud(troll.getSalud() - daño);
                                n++;
                            }
                        }
                    }
                    if (i == 2) {
                        int n = 0;
                        System.out.println(humanos.get(i).getNombre() + " ataca a " + troll.getNombre() + " con "+ humanos.get(i).getAtaque());
                        while (n != 2) {
                            daño = ataqueArco.atacar();
                            if(daño == 0){
                                System.out.println("[" + troll.getSalud() + "]" + "-" + "[falla] = ["+ (troll.getSalud() - daño) + "]");
                                troll.setSalud(troll.getSalud() - daño);
                                n++;
                            }else{
                                System.out.println("[" + troll.getSalud() + "]" + "-" + "[" + daño + "] = [" + (troll.getSalud() - daño) + "]");
                                troll.setSalud(troll.getSalud() - daño);
                                n++;
                            }
                        }
                    }
                    if (troll.getSalud() <= 0) {
                        System.out.println(troll.getNombre() + " ha muerto");
                        monstruos.remove(troll);
                    }
                    if (monstruos.size() == 0) {
                        System.out.println("Los humanos han ganado");
                    }

                } catch (IndexOutOfBoundsException e) {}
            }
            // ataque monstruos
            for (int i = 0; i < monstruos.size(); i++) {
                int randomHumano = (int) (Math.random() * humanos.size());
                try {
                    Personaje humano = humanos.get(randomHumano);
                    switch ((int) (Math.random() * 3 + 1)) {
                        case 1:
                            AtaqueEspada ataqueEspada = new AtaqueEspada();
                            monstruos.get(i).setAtaque(new AtaqueEspada());
                            daño = ataqueEspada.atacar();
                            break; 
                        case 2:
                            AtaqueArco ataqueArco = new AtaqueArco();
                            monstruos.get(i).setAtaque(new AtaqueArco());
                            daño = ataqueArco.atacar();
                            break;
                        case 3:
                            AtaqueCuchillo ataqueCuchillo = new AtaqueCuchillo();
                            monstruos.get(i).setAtaque(new AtaqueCuchillo());
                            daño = ataqueCuchillo.atacar();
                            break;
                            
                        default:
                            ataqueEspada = new AtaqueEspada();
                            monstruos.get(i).setAtaque(new AtaqueEspada());
                            daño = ataqueEspada.atacar();
                            break;
                    }
                    if(daño == 0){
                        System.out.println(monstruos.get(i).getNombre() + " ataca a " + humano.getNombre() + " con "+ monstruos.get(i).getAtaque());
                        System.out.println("[" + humano.getSalud() + "]" + "-" + "[falla] = ["+ (humano.getSalud() - daño) + "]");
                        humano.setSalud(humano.getSalud() - daño);
                    } else {
                        System.out.println(monstruos.get(i).getNombre() + " ataca a " + humano.getNombre() + " con "+ monstruos.get(i).getAtaque());
                        System.out.println("[" + humano.getSalud() + "]" + "-" + "[" + daño + "] = ["+ (humano.getSalud() - daño) + "]");
                        humano.setSalud(humano.getSalud() - daño);
                    }
                    if (humano.getSalud() <= 0) {
                        System.out.println(humano.getNombre() + " ha muerto");
                        humanos.remove(humano);
                    }
                    if (humanos.size() == 0) {
                        System.out.println("Los monstruos han ganado");
                    }
                } catch (IndexOutOfBoundsException e) {}    
            }
        }
    }
}