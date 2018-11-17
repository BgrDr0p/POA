package fr.parisnanterre.miage.poa.universite.impl;

import fr.parisnanterre.miage.poa.universite.api.Departement;
import fr.parisnanterre.miage.poa.universite.api.IEnseignantPermanent;
import java.util.Date;

public class EnseignantPermanent extends Enseignant implements IEnseignantPermanent {

    private String domaineRecherche;



    public EnseignantPermanent(String nom, String prenom, String numeroSecu, Date dateRecrutement, Departement departement, double salaire, String domaineRecherche) {
        super(nom, prenom, numeroSecu, dateRecrutement, departement,salaire);
        this.domaineRecherche = domaineRecherche;
    }

    public String domaineRecherche() {
        return domaineRecherche;
    }

    @Override
    public String toString() {
        return String.format("Enseignant %s, domaine : %s", super.toString(), domaineRecherche);
    }
}
