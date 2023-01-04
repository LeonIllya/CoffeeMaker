import client.Client;

import utils.OptionFilter;
import utils.Validator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {


        System.out.println("Choose a drink:" +
                            "\n1 - Espresso" +
                            "\n2 - Cappuccino" +
                            "\n3 - Latte"
                            );
        Scanner scanner = new Scanner(System.in);
        int option = Validator.validateOptionInput(scanner);

        Client client = new Client();
        OptionFilter.getCoffee(option, client);
        client.getCoffee();
    }
}
