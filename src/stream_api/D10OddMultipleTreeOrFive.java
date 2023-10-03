package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class D10OddMultipleTreeOrFive {
    Values values = new Values();
    List<Integer> array = values.numbers;


    public void method() {
        this.array = this.array.stream().map(x -> {
            if (x%2 == 1 && (x%5 == 0 ||  x%3 == 0)){
                return x;
            }
            return 0;
        }).collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();

        this.array.forEach(x -> {
            if (x != 0){
                result.add(x);
            }
        });

        System.out.println(result);
    }

    public static void main(String[] args) {
        D10OddMultipleTreeOrFive result = new D10OddMultipleTreeOrFive();
        System.out.println(result.array);
        result.method();
    }
}
