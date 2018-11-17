package fr.parisnanterre.miage.poa.universite.impl;

import java.util.Date;

public class Bibliothequaire extends Biatoss {
    public Bibliothequaire(String nom, String prenom, String numero, Date datefin) {
        super(nom, prenom, numero, datefin);
    }
    @Override
    public String toString()
    {
        return String.format("Bibliothequaire%s",super.toString());
    }
}
