package task3;

import java.util.*;
import java.util.stream.IntStream;

/**
 * This class contains a method that reads a graph from the user input and returns the graph as a hash map.
 */
public class GraphScanner {

    /**
     * reads the graph from the user input via scanner and returns graph as hash map
     * @return Graph as HashMap
     */
    public static HashMap<Integer, List<Integer>> scan() {
        //create empty HashMap for graph
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        //flags to control loop
        boolean isDone = false;
        boolean isOutputCorrect = false;

        //Run loop until input is correct and graph is created
        while (!isDone) {
            try {
                //reads number of pairs from user input
                System.out.println("Insert number of pairs:");
                int n = sc.nextInt();
                //consumes remaining newline character
                sc.nextLine();

                //reads all pairs and add them do graph
                System.out.println("Insert all pairs:");
                IntStream.range(0, n)
                        //read each line and splits it in space
                        .mapToObj(i -> sc.nextLine().split(" "))
                        //for each mapped array, parse to integers and adds to graph as a pair
                        .forEach(tokens -> {
                            int u = Integer.parseInt(tokens[0]);
                            int v = Integer.parseInt(tokens[1]);
                            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v); //ads to key u value v
                            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u); //ads to key v value u
                        });
                isDone = true; //stops next iteration of while loop
                isOutputCorrect = true; //flags input as correct

            } catch (NumberFormatException e) { //Print an error message if the input is invalid breaks loop
                System.out.println("Error: Invalid input. Expected a number.\nStart over: ");
                break;
            }
        }
        //If input is incorrect, call method again to start over
        if (!isOutputCorrect) {
            scan();
        }
        //if input is valid returns created graph
        return graph;
    }

}
