package scooter;

public class ScooterEssence extends Scooter{

    public ScooterEssence(String moteur,int cv)
    {
        super(moteur,cv);
    }

    public void afficher(){
        System.out.println("Le scooter essence dispose de "+super.moteur+" "+super.cv);
    }
}
