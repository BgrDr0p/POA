package scooter;

public class ScooterElectrique extends Scooter {

    public ScooterElectrique(String moteur,int cv)
    {
        super(moteur, cv);
    }

    public void afficher(){
        System.out.println("Le scooter electrique dispose de "+super.moteur+" "+super.cv);
    }


}
