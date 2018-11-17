package fr.parisnanterre.miage.poa.universite.impl;

import fr.parisnanterre.miage.poa.universite.api.Departement;
import fr.parisnanterre.miage.poa.universite.api.IEnseignant;

import java.util.Date;

public class Enseignant extends Personnel implements IEnseignant {
    private Date dateRecrutement;
    private double salaire;

    public Enseignant(String nom, String prenom, String numeroSecu, Date dateRecrutement, Departement departement, double salaire) {
        super(nom, prenom, numeroSecu,departement);
        this.dateRecrutement = dateRecrutement;
        this.salaire = salaire;
    }

    public Date dateRecrutement() {
        return dateRecrutement;
    }

    @Override
    public Date recrutement() {
        return this.dateRecrutement;
    }

    public double salaire() {
        return salaire;
    }

    @Override
    public String toString() {
        return String.format("%s recrute le %s", super.toString(), dateRecrutement);
    }


}


