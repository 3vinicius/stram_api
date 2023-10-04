package stream_api;

import java.util.List;
import java.util.stream.Collectors;

public class D13FilterInterval {
    Values values = new Values();
    List<Integer> array = values.numbers;


    public void method(int min,int max) {


        System.out.println(array.stream().filter(x -> x>=min && x<=max).collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        D13FilterInterval result = new D13FilterInterval();
        System.out.println(result.array);
        result.method(3,10);
    }
}
