package fr.parisnanterre.miage.poa.universite.impl;

import java.util.Date;
public class Biatoss extends Personnel {

    private Date datefin;

    public Biatoss(String nom, String prenom, String numero, Date datefin) {
        super(nom, prenom, numero);
        this.datefin = datefin;
    }

    @Override
    public String toString()
    {
        return String.format("Biatoss%s",super.toString());
    }

}
