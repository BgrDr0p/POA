package fr.parisnanterre.miage.poa.universite.impl;

import fr.parisnanterre.miage.poa.universite.api.Departement;

import java.util.Date;

public class Ater extends EnseignantTemporaire {
    public Ater(String nom, String prenom, String numeroSecu, Date dateRecrutement, double salaire, Date dateFinContrat,Departement departement)
    {
        super(nom, prenom, numeroSecu, dateRecrutement,departement ,salaire, dateFinContrat);
    }

    @Override
    public String toString()
    {
        return String.format("Ater %s",super.toString());
    }
}
