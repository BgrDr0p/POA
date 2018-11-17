package fr.parisnanterre.miage.poa.universite.impl;

import fr.parisnanterre.miage.poa.universite.api.Departement;

public class Doctorant extends Etudiant {

    public Doctorant(String nom, String prenom, String numero, double bourse, Departement departement)
    {
        super(nom,prenom,numero,bourse,departement);
    }


    @Override
    public String toString()
    {
        return String.format("Doctorant %s", super.toString());
    }
}
