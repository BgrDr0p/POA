package fr.parisnanterre.miage.poa.universite.impl;

import fr.parisnanterre.miage.poa.universite.api.Departement;

import java.util.Date;

public class EnseignantTemporaire extends Enseignant {

    private Date dateFinContrat;


    public EnseignantTemporaire(String nom, String prenom, String numeroSecu, Date dateRecrutement, Departement departement, double salaire, Date dateFinContrat) {
        super(nom, prenom, numeroSecu, dateRecrutement,departement, salaire);
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
