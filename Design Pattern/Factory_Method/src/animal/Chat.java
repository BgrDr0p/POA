package animal;

public class Chat implements IAnimal {

    public Chat(){

    }
    @Override
    public void EffectuerBruit()
    {
        System.out.print("Bruit de chat");
    }
}
