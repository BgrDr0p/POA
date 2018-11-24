package animal;

public class Chien implements IAnimal{

    public Chien(){}

    @Override
    public void EffectuerBruit()
    {
        System.out.print("Bruit de chien");
    }
}

