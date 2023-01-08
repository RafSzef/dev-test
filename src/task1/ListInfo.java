package task1;

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.stream.Collectors;

public class ListInfo {

    public String getAllInfo (List<Integer> list) {
        return String.format("%s\ncount: %d \ndistinct: %d \nmin: %d\nmax: %d",
                getSortedListInCorrectFormat(list),
                getCount(list),
                getCountOfDistinctElements(list),
                getMin(list),
                getMax(list));
    }

    private String getSortedListInCorrectFormat(List<Integer> list) {
        return list.stream()
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(" "));
    }

    private int getCount (List<Integer> list) {
        return list.size();
    }

    private long getCountOfDistinctElements (List<Integer> list) {
        return list.stream().distinct().count();
    }

    private long getMin (List<Integer> list) {
        return list.stream()
                .min(Comparator.comparingInt(i ->i))
                .orElseThrow(InputMismatchException::new);
    }

    private long getMax (List<Integer> list) {
        return list.stream()
                .max(Comparator.comparingInt(i ->i))
                .orElseThrow(InputMismatchException::new);
    }
}
