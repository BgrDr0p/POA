package fr.parisnanterre.miage.poa.universite.impl;

import fr.parisnanterre.miage.poa.universite.api.Departement;

public class Main {

    public static void main(String[] args) {

        Etudiant etudiant = new Etudiant("hassan","hassan","11",11.2,Departement.Philosophie);

        System.out.println(etudiant.getDepartement());






    }
}
