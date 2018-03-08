package net.vidalibarraquer.laiass.projecteandroid;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alumne on 06/03/18.
 */

public class Jugador {
    private String nom;
    private int moneder;
    private List<Carrer> carrer;
    private Boolean estat;

    public Jugador(String nom) {
        this.nom = nom;
        moneder = 2500;
        carrer = new ArrayList<>();
        //true segueix jugant
        estat = true;
    }

    public String getNom(){
        return nom;
    }
    public int getMoneder(){
        return moneder;
    }

    public List<Carrer> getCarrer() {
        return carrer;
    }

    public Boolean getEstat() {
        return estat;
    }

    public void afegirCarrer(Carrer c){
        carrer.add(c);
    }

    public void eliminarCarrer(Carrer c){
        carrer.remove(c);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMoneder(int moneder) {
        this.moneder = moneder;
    }

    public void setMonederCompra(int preu){
        this.moneder -= preu;
    }

    public void setMonederVenta(int preu){
        this.moneder += preu;
    }

    public void setCarrer(List<Carrer> carrer) {
        this.carrer = carrer;
    }

    public void setEstat(Boolean estat) {
        this.estat = estat;
    }
}
