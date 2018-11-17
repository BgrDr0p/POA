package fr.parisnanterre.miage.poa.universite.impl;

import java.util.Date;

public class Secretaire extends Biatoss{
    public Secretaire(String nom, String prenom, String numero, Date datefin) {
        super(nom, prenom, numero, datefin);
    }

    @Override
    public String toString()
    {
        return String.format("Secretaire%s",super.toString());
    }
}
