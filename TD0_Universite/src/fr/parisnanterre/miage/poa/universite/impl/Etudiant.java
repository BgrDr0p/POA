package fr.parisnanterre.miage.poa.universite.impl;

public class Etudiant extends Personnel{
    private double bourse;

    public Etudiant (String nom,String prenom,String numero,Double bourse)
    {
        super(nom,prenom,numero);
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
