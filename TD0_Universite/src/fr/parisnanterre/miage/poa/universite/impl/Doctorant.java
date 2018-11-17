package fr.parisnanterre.miage.poa.universite.impl;

public class Doctorant extends Etudiant {

    public Doctorant(String nom,String prenom,String numero,double bourse)
    {
        super(nom,prenom,numero,bourse);
    }


    @Override
    public String toString()
    {
        return String.format("Doctorant %s", super.toString());
    }
}
