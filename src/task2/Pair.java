package task2;

class Pair {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int sum() {
        return first + second;
    }

    @Override
    public String toString() {
        return first + " " + second;
    }


}