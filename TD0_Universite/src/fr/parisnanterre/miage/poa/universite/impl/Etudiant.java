package fr.parisnanterre.miage.poa.universite.impl;

import fr.parisnanterre.miage.poa.universite.api.Departement;

public class Etudiant extends Personnel{
    private double bourse;

    public Etudiant (String nom, String prenom, String numero, Double bourse, Departement departement)
    {
        super(nom,prenom,numero,departement);
        this.bourse = bourse;
    }

    public double getBourse() {
        return bourse;
    }

    public void setBourse(double bourse) {
        this.bourse = bourse;
    }
    @Override
    public String toString()
    {
        return String.format("Etudiant %s",super.toString());
    }
}
