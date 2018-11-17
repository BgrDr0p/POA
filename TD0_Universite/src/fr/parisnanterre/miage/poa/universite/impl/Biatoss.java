package fr.parisnanterre.miage.poa.universite.impl;

import fr.parisnanterre.miage.poa.universite.api.Departement;

import java.util.Date;
public class Biatoss extends Personnel {

    private Date datefin;

    public Biatoss(String nom, String prenom, String numero, Departement departement, Date datefin) {
        super(nom, prenom, numero,departement);
        this.datefin = datefin;
    }

    @Override
    public String toString()
    {
        return String.format("Biatoss%s",super.toString());
    }

}
