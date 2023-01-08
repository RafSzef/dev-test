package task1;

import java.util.List;

public class Task1 {
    /**
     * Task1
     * The input is a long list of integers. Please write a small app that will output the list of distinct elements sorted in ascending order, plus the basic measurement information that contains the number of elements in the source, number of distinct elements, min and max value.
     * <p>
     * Sample:
     * <p>
     * For the input:
     * <p>
     * 1 10 20 20 2 5
     * expected output is:
     * <p>
     * 1 2 5 10 20
     * count: 6
     * distinct: 5
     * min: 1
     * max: 20
     */
    public static void main(String[] args) {
        List<Integer> inputList = InputParser.getIntegerListFromInput();
        ListInfo listInfo = new ListInfo();
        System.out.println(listInfo.getAllInfo(inputList));
    }
}
