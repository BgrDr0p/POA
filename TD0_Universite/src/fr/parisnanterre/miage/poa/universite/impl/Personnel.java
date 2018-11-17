package fr.parisnanterre.miage.poa.universite.impl;

import fr.parisnanterre.miage.poa.universite.api.Departement;

public abstract class Personnel {

    private String nom;
    private String prenom;
    private String numero;
    private Departement departement;


    public Personnel(String nom, String prenom, String numero, Departement departement) {
        this.nom = nom;
        this.prenom = prenom;
        this.numero = numero;
        this.departement = departement;


    }

    public Departement getDepartement()
    {
        return this.departement;
    }
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNumero() {
        return numero;
    }

    // @Override
    public String tostring()
    {
        return String.format("%s, %s, %s", nom, prenom, numero);
    }
}
