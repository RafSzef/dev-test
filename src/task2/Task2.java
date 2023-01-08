package task2;

import utility.InputParser;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        //Creating input ArrayList using Input parser from previous Task
        List<Integer> inputList = InputParser.getIntegerListFromInput();
        //using static method to get all pairs that sums up to 13, then printing each pair
        PairFinder.findPairsThatSumTo13(inputList).forEach(System.out::println);
    }
}
