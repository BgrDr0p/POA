package fr.parisnanterre.miage.poa.universite.impl;

public abstract class Personnel {

    private String nom;
    private String prenom;
    private String numero;

    public Personnel(String nom, String prenom, String numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.numero = numero;
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
