package task2;

/**
 * Class representing a pair of numbers
 */
class Pair {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    /**
     * A method that sums the value of two numbers in a pair
     * @return sum of thwo numbers
     */
    public int sum() {
        return first + second;
    }

    //overridden toString to keep excepted format while printing pair value on console
    @Override
    public String toString() {
        return first + " " + second;
    }


}