package fr.parisnanterre.miage.poa.universite.impl;

import java.util.Date;

public class Vacataire extends EnseignantTemporaire {
    public Vacataire(String nom, String prenom, String numeroSecu, Date dateRecrutement, double salaire, Date dateFinContrat) {
        super(nom, prenom, numeroSecu, dateRecrutement, salaire, dateFinContrat);
    }

    @Override
    public String toString()
    {
        return String.format("Vacataire%s",super.toString());
    }
}
