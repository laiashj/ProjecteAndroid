package net.vidalibarraquer.laiass.projecteandroid;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 08/03/2018.
 */

public class Model {
    List<Jugador> jugadors;
    List<Carrer> carrers;
    int mida;


    public Model(int mida){
        this.mida = mida;
        jugadors = new ArrayList<>();
        carrers = new ArrayList<>();

    }

    public void afegirJugador(Jugador jug){
        jugadors.add(jug);
    }

    public int getMida(){
        return mida;
    }

    public String getJugadorTorn(int n){
        return jugadors.get(n).getNom();
    }

    public boolean fiJoc(){
        boolean fi = false;
        int cont = 0;
        for (Jugador jugador:jugadors) {
            if (!jugador.getEstat()){
                cont++;
            }
        }
        if (cont == mida-1){
            fi = true;
        }
        return fi;
    }

    public boolean comprarCarrer(Jugador j, Carrer c){
        boolean comprat = false;
        if (j.getMoneder() >= c.getPreuCompra()){
            j.afegirCarrer(c);
            j.setMonederCompra(c.getPreuCompra());
            comprat = true;
        }
        return comprat;
    }

    public boolean vendreCarrer(Jugador jv, Carrer c, Jugador jc, int preu){
        boolean venut = false;
        if (jc.getMoneder() >= preu){
            jc.afegirCarrer(c);
            jc.setMonederCompra(preu);
            jv.setMonederVenta(preu);
            jv.eliminarCarrer(c);
            venut = true;
        }
        return venut;
    }

}
