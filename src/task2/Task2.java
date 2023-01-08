package task2;

import utility.InputParser;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<Integer> inputList = InputParser.getIntegerListFromInput();;
        PairFinder.findPairsThatSumTo13(inputList).forEach(System.out::println);
    }
}
