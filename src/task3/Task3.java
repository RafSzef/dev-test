package task3;

import java.util.HashMap;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        //HashMap stores verticle and all connected neighbour verticles
        HashMap<Integer, List<Integer>> inputMap = GraphScanner.scan();
        GraphCounter graphCounter = new GraphCounter();
        //graphCounter counts all sub-graphs, then prints them on console
        System.out.println(graphCounter.countGraphs(inputMap));
    }
}
