package utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class used to get input from user via console then return list with Integers
 */
public class InputParser {

    // method is static so we can use the method without the need to create a class.
    public static List<Integer> getIntegerListFromInput() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();

        //could use boolean flag instead of single return
        while (true) {
            System.out.println("Please enter a list of integers separated by spaces: ");
            String input = scanner.nextLine(); //scans line
            String[] tokens = input.split(" "); //splits input to array.
            boolean inputIsValid = true; //flag used to verify if user entered data in the correct format.

            // enhanced for loop iterates over all values in tokens array.
            for (String token: tokens) {
                // try&catch because we scan whole line.
                // In case the user has entered an incorrect format,we will receive an exception.
                try {
                    //Parse each element of tokens array to Integer, then add to list.
                    integerList.add(Integer.parseInt(token));
                } catch (NumberFormatException e) {
                    inputIsValid = false; //we flag input as invalid.
                    break; // we break for loop - no need to iterate over next values.
                }
            }

            //checks if exception occurred in for loop
            if (inputIsValid) {
                return integerList; //if no error occurred we return list with all values in Integer.
            } else {
                integerList.clear(); //Removes all of the elements from this list.
                System.out.println("Invalid input. Please try again.");
                // there's no return statement, while loop will continue with another iteration.
            }
        }

    }

}
