package stream_api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class D16OddAndPairs {
    Values values = new Values();
    List<Integer> array = values.numbers;


    public void method() {

        List<Integer> negativesList = new ArrayList<>();
        List<Integer> positivesList = new ArrayList<>();

        array.stream().sorted(Comparator.naturalOrder()).forEach(x -> {
            if (Integer.compare(x,0) < 0){
                negativesList.add(x);
            } else if (Integer.compare(x,0) >= 0) {
                positivesList.add(x);
            }
        });

        System.out.println("List Positives " + positivesList);
        System.out.println("List Negatives " + negativesList);
    }

    public static void main(String[] args) {
        D16OddAndPairs result = new D16OddAndPairs();
        System.out.println(result.array);
        result.method();
    }
}
