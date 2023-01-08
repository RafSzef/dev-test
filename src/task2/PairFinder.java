package task2;

import java.util.List;
import java.util.stream.Collectors;

public class PairFinder {

    //I could split sorting, mapping and filtering.
    public static List<Pair> findPairsThatSumTo13(List<Integer> list) {
        return list.stream()//stream of Integers
                .sorted()//sorted stream of Integers
                .flatMap(i -> list.stream() //creates new stream for each element in original stream
                        .skip(list.indexOf(i) + 1)//new stream contains all the elements in the original stream
                                                        // except the element at the current index.
                        .map(j -> new Pair(i, j)))//maps each element in the new stream to a Pair object with
                                                    // the current element as the first element in the pair.
                .filter(pair -> pair.sum() == 13)//filter created pairs based on condition that sum == 13
                .collect(Collectors.toList());//collects all the elements in the stream into a list and returns the list.
    }
}
