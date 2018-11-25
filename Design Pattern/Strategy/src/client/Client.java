package client;

import operation.Addition;
import operation.Contexte;
import operation.Multiplication;
import operation.Soustraction;

public class Client {
    public static void main(String[] args) {


        Contexte context = new Contexte(new Addition());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));


        context = new Contexte(new Soustraction());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Contexte(new Multiplication());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

    }
}
