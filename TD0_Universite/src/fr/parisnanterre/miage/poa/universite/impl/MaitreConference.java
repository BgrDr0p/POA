package fr.parisnanterre.miage.poa.universite.impl;

import fr.parisnanterre.miage.poa.universite.api.Departement;

import java.util.Date;

public class MaitreConference extends EnseignantPermanent {

    public MaitreConference(String nom, String prenom, String numeroSecu, Date dateRecrutement, double salaire, String domaineRecherche, Departement departement)
    {
        super(nom,prenom,numeroSecu,dateRecrutement,departement, salaire,domaineRecherche);
    }

    @Override
    public String toString()
    {
        return String.format("Maitre de conférence%s",super.toString());
    }


}
