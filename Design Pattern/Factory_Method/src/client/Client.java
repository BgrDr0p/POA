package client;

import animal.AnimalFactory;
import animal.Chien;
import animal.IAnimal;


public class Client {

    public static void main(String[] args){
        IAnimal animal = new Chien();
        animal.EffectuerBruit();


    }
}
