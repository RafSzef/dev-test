package task1;

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class used to get all info needed in task 1.
 * All methods except getAllInfo are private.
 * All methods return values - ready for unit test
 */
public class ListInfo {

    /**
     * @param list - list of numbers [Integer]
     * @return String formatted for the task
     */
    public String getAllInfo(List<Integer> list) {
        //Use of String.format allowed me to add many parameters in a readable way
        return String.format("%s\ncount: %d \ndistinct: %d \nmin: %d\nmax: %d",
                getSortedListInCorrectFormat(list),
                getCount(list),
                getCountOfDistinctElements(list),
                getMin(list),
                getMax(list));
    }

    //I decided to return sorted list in correct format.
    private String getSortedListInCorrectFormat(List<Integer> list) {
        return list.stream() //start stream
                .sorted() //sorts values
                .map(Object::toString) //maps every int value to string
                .collect(Collectors.joining(" ")); //collects mapped object to single String with joining method
        // from Collectors.
    }

    private int getCount(List<Integer> list) {
        return list.size(); // Are You really reading this? Go to task 3 already
    }

    private long getCountOfDistinctElements(List<Integer> list) {
        return list.stream().distinct().count(); //.count returns long value, I could convert to int with return (int) list...
    }

    private long getMin(List<Integer> list) {
        return list.stream()
                .min(Comparator.comparingInt(i -> i)) //finding min values using Comparator
                .orElseThrow(InputMismatchException::new); //throws exception in case there's nothing to compare
    }

    private long getMax(List<Integer> list) {
        return list.stream()
                .max(Comparator.comparingInt(i -> i))//finding max values using Comparator
                .orElseThrow(InputMismatchException::new);//throws exception in case there's nothing to compare
    }
}
