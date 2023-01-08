package task3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class contains method that count separate sub-graphs (separate graphs) in graph
 */
public class GraphCounter {
    //counter of sub-graphs initialized to 0
    private int numberOfGraphs = 0;
    //create map to store visited verticles
    private Map<Integer, Boolean> visited = new HashMap<>();

    // While trying to solve this task i stumbled upon and decided to use Depth-First Search.
    //    https://en.wikipedia.org/wiki/Depth-first_search
    // Depth-first search (DFS) is a graph traversal algorithm that starts at the root node
    // and explores as far as possible along each branch before backtracking.
    // Here it starts from verticle (node in other sources) u, flags it as visited, then it checks all the node's neighbours.
    // If neighbour has not been visited, the method recursively calls itself on that neighbour.
    // It repeats until no unvisited neighbours are available.
    // Then method returns to previous verticle and continue to search another neighbour.
    // Process continues until all the verticles have been visited.
    //
    // In countGraphs() method I start with single verticle and visit all it neighbours using depthFirstSearch() method.
    // Then I continue to iterate over all keys in graph.
    // If We find another unvisited node it means it's another sub-graph, not connected to previous ones.
    // With each unvisited verticle found counter is increased.
    // Process is repeated until no unvisited verticles are available.

    /**
     * Method counts the number of separate sub-graphs in given graph
     * @param graph to search su-graphs inside
     * @return count of separate sub-graphs
     */
    public int countGraphs(HashMap<Integer, List<Integer>> graph) {
        //for each verticle
        for (int u : graph.keySet()) {
            //checks if verticle was visited
            if (!visited.containsKey(u)) {
                //increase counter
                numberOfGraphs++;
                //runs method with depth-first search on the verticle to find all connected nodes.
                depthFirstSearch(u, visited, graph);
            }
        }
        //returns number of separate sub-graphs
        return numberOfGraphs;
    }

    /**
     * This method performs a depth-first search on the given node.
     * @param u the verticle to start search from
     * @param visited map that contains visited verticles
     * @param graph graph to search.
     */
    private void depthFirstSearch(int u, Map<Integer, Boolean> visited, Map<Integer, List<Integer>> graph) {
        //flag verticle as visited
        visited.put(u, true);
        //for each neighbour of the verticle
        for (int v : graph.get(u)) {
            //if neighbour has not been visited
            if (!visited.containsKey(v)) {
                //Run depth-first search on neighbour (with use of recursion)
                depthFirstSearch(v, visited, graph);
            }
        }
    }

}
