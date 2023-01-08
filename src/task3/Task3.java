package task3;

import java.util.HashMap;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        HashMap<Integer, List<Integer>> inputMap = GraphScanner.scan();
        GraphCounter graphCounter = new GraphCounter();
        System.out.println(graphCounter.countGraphs(inputMap));
    }
}
