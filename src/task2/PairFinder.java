package task2;

import java.util.List;
import java.util.stream.Collectors;

public class PairFinder {

    public static List<Pair> findPairsThatSumTo13(List<Integer> list) {
        return list.stream()
                .sorted()
                .flatMap(i -> list.stream()
                        .skip(list.indexOf(i) + 1)
                        .map(j -> new Pair(i, j)))
                .filter(pair -> pair.sum() == 13)
                .collect(Collectors.toList());
    }
}
