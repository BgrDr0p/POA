package distribution;

public class Employe {
    private String nom;
    private String poste;

    public Employe(String nom,String poste)
    {
        this.nom = nom;
        this.poste = poste;

    }

    public void AfficherNom()
    {
        System.out.print("Nom de l'employé" + this.nom);

    }
    public void AfficherPoste()
    {
        System.out.print("Poste :" + this.poste);
    }


}
