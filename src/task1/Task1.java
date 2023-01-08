package task1;

import Utility.InputParser;

import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        List<Integer> inputList = InputParser.getIntegerListFromInput();
        ListInfo listInfo = new ListInfo();
        System.out.println(listInfo.getAllInfo(inputList));
    }
}
