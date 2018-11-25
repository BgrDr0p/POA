package scooter;

public abstract class Scooter {

    protected String moteur;
    protected int cv;

    public Scooter(String moteur,int cv)
    {
        this.moteur = moteur;
        this.cv = cv;
    }



}