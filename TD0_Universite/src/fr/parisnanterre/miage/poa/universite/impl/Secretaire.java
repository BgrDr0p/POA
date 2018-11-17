package fr.parisnanterre.miage.poa.universite.impl;

import fr.parisnanterre.miage.poa.universite.api.Departement;

import java.util.Date;

public class Secretaire extends Biatoss{

    public Secretaire(String nom, String prenom, String numero, Date datefin, Departement departement) {
        super(nom, prenom,numero, departement, datefin);
    }

    @Override
    public String toString()
    {
        return String.format("Secretaire%s",super.toString());
    }
}
