package utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class used to get input from user via console then return list with ints
 */
public class InputParser {

    public static List<Integer> getIntegerListFromInput() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();

        while (true) {

            System.out.println("Please enter a list of integers separated by spaces: ");
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");
            boolean inputIsValid = true;

            for (String token: tokens) {
                try {
                    integerList.add(Integer.parseInt(token));
                } catch (NumberFormatException e) {
                    inputIsValid = false;
                    break;
                }
            }

            if (inputIsValid) {
                return integerList;
            } else {
                integerList.clear();
                System.out.println("Invalid input. Please try again.");
            }
        }

    }

}
