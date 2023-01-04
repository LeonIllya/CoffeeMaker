package utils;

import client.Client;
import drinks.Cappuccino;
import drinks.Espresso;
import drinks.Latte;

public class OptionFilter {

    public static void getCoffee(int option, Client client){

        switch (option) {
            case 1 -> client.setCoffee(new Espresso());
            case 2 -> client.setCoffee(new Cappuccino());
            case 3 -> client.setCoffee(new Latte());
        }
    }
}
