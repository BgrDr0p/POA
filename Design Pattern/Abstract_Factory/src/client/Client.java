package Client;

import scooter.*;

import java.util.Scanner;

public class Client {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        Scooter scooter;

        System.out.println("Voulez vous un scooter electrique ou essence");
        String area = sc.nextLine();

        if(area.equals("electrique"))
            scooter = new ScooterElectrique("Faible",100);
        else
            scooter = new ScooterEssence("PUISSANT",200);





    }
}
