package fr.parisnanterre.miage.poa.universite.impl;



import java.util.Date;
public class Professeur extends EnseignantPermanent  {

    public Professeur(String nom, String prenom, String numeroSecu, Date dateRecrutement, double salaire, String domaineRecherche)
    {

        super(nom, prenom, numeroSecu, dateRecrutement, salaire, domaineRecherche);
    }

    @Override
    public String toString() {
        return String.format("Professeur %", super.toString());
    }


}
