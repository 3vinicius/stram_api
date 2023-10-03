package stream_api;

import java.util.List;

public class D2SumPairs {
    Values values = new Values();
    List<Integer> array;

    public D2SumPairs() {
        this.array = values.numbers;

    }

    public void printSumPair () {
        System.out.println(this.array.stream().filter(x -> x%2 == 0).reduce(0,(x,y)->x+y));
    }

    public static void main(String[] args) {
        D2SumPairs result = new D2SumPairs();
        System.out.println(result.array);
        result.printSumPair();
    }
}
