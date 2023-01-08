package task3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphCounter {
     private int numberOfGraphs = 0;
     private Map<Integer, Boolean> visited = new HashMap<>();

     public int countGraphs(HashMap<Integer, List<Integer>> graph) {
         for (int u: graph.keySet()) {
             if (!visited.containsKey(u)) {
              numberOfGraphs++;
              depthFirstSearch(u, visited, graph);
             }
         }
         return numberOfGraphs;
     }

    private void depthFirstSearch(int u, Map<Integer, Boolean> visited, Map<Integer, List<Integer>> graph) {
         visited.put(u, true);
         for (int v : graph.get(u)) {
             if (!visited.containsKey(v)) {
                 depthFirstSearch(v, visited, graph);
             }
         }
    }

}
