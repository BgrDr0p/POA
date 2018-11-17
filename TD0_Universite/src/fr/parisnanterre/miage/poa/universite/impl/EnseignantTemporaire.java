package fr.parisnanterre.miage.poa.universite.impl;

import java.util.Date;

public class EnseignantTemporaire extends Enseignant {

    private Date dateFinContrat;


    public EnseignantTemporaire(String nom, String prenom, String numeroSecu, Date dateRecrutement, double salaire, Date dateFinContrat) {
        super(nom, prenom, numeroSecu, dateRecrutement, salaire);
        this.dateFinContrat = dateFinContrat;
    }

    public Date getDateFinContrat()
    {
        return this.dateFinContrat;
    }
    @Override
    public String toString()
    {
        return String.format("Enseignant temporaire%s",super.toString());
    }

}
