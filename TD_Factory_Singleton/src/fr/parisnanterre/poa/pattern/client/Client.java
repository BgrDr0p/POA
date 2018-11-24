package fr.parisnanterre.poa.pattern.client;
import fr.parisnanterre.poa.pattern.products.*;
public class Client {

    public Client() {
        prodA = new ProductA();
    }
    public void foo () {
        prodA.doYourStuff();
        ProductB myProdB = new ProductB();
        myProdB.doIt();
        ProductC myProdC = new ProductC();
        myProdC.perform();

    }
    ProductA prodA;
    ProductB prodB;
}

