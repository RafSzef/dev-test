package task3;

import java.util.*;
import java.util.stream.IntStream;

public class GraphScanner {

    public static HashMap<Integer, List<Integer>> scan() {
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        boolean isDone = false;
        boolean isOutputCorrect = false;

        while (!isDone) {
            try {
                System.out.println("Insert number of pairs:");
                int n = sc.nextInt();
                //consumes remaining newline character
                sc.nextLine();

                System.out.println("Insert all pairs:");
                IntStream.range(0, n)
                        .mapToObj(i -> sc.nextLine().split(" "))
                        .forEach(tokens -> {
                            int u = Integer.parseInt(tokens[0]);
                            int v = Integer.parseInt(tokens[1]);
                            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
                            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
                        });
                isDone = true;
                isOutputCorrect = true;

            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Expected a number.\nStart over: ");
                break;
            }
        }
        if (!isOutputCorrect) {
            scan();
        }
        return graph;
    }

}
