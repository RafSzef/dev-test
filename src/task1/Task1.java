package task1;

import utility.InputParser;

import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        //Create List containing Integer with usage of InputParserList
        List<Integer> inputList = InputParser.getIntegerListFromInput();
        ListInfo listInfo = new ListInfo(); //Create new ListInfo class
        System.out.println(listInfo.getAllInfo(inputList));//Print basic info in expected format
    }
}
