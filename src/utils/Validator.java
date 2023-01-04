package utils;

import java.util.Scanner;

public class Validator {


    public static int validateOptionInput(Scanner scanner) {

        int[] options = { 1, 2, 3};


        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf(Constants.NO_A_NUMBER_MSG, str);
        }

        int number = scanner.nextInt();

        while (!contains(options, number)){
            System.out.println(Constants.NO_SUCH_OPTION_MSG);
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf(Constants.NO_A_NUMBER_MSG, str);
            }
            number = scanner.nextInt();
        }
        return number;
    }

    public static boolean contains(final int[] array, final int value) {
        boolean result = false;
        for (int i : array) {
            if (i == value) {
                result = true;
                break;
            }
        }
        return result;
    }
}

