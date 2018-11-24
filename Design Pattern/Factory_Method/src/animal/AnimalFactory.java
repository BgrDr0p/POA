package animal;

public final class AnimalFactory {

    // mise en place d'un Singleton
    private static AnimalFactory uniqueInstance;

    // creation d'un constructeur pour le singleton
    public AnimalFactory getInstance()
    {
        if(uniqueInstance == null)
        {
            uniqueInstance = new AnimalFactory();
            System.out.println("Creation de l'unique instance");
        }
        return uniqueInstance;

    }

    private AnimalFactory(){}

    public IAnimal createAnimal(String type){
        IAnimal animal = null;
        if(type.equals("chat"))
        {
            animal = new Chat();
        }
        else if(type.equals("chien"))
        {
            animal = new Chien();

        }
        else
            {
                System.out.println("L'animal n'existe pas !");
        }
        return animal;

    }

}
