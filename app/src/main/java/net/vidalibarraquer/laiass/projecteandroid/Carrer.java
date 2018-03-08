package net.vidalibarraquer.laiass.projecteandroid;

/**
 * Created by Admin on 08/03/2018.
 */

public class Carrer {
    private String nom;
    private int preuCompra;
    private int preuPeatge;
    private boolean comprat;

    public Carrer(String nom, int preuCompra, int preuPeatge) {
        this.nom = nom;
        this.preuCompra = preuCompra;
        this.preuPeatge = preuPeatge;
        comprat = false;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPreuCompra() {
        return preuCompra;
    }

    public void setPreuCompra(int preuCompra) {
        this.preuCompra = preuCompra;
    }

    public int getPreuPeatge() {
        return preuPeatge;
    }

    public void setPreuPeatge(int preuPeatge) {
        this.preuPeatge = preuPeatge;
    }

    public boolean isComprat() {
        return comprat;
    }

    public void setComprat(boolean comprat) {
        this.comprat = comprat;
    }
}
