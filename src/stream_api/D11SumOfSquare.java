package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class D11SumOfSquare {

    Values values = new Values();
    List<Integer> array = values.numbers;


    public void method() {
        this.array = this.array.stream().map(x -> x*x).collect(Collectors.toList());


        System.out.println(array.stream().reduce(0,(x,y) -> x+y));
    }

    public static void main(String[] args) {
        D11SumOfSquare result = new D11SumOfSquare();
        System.out.println(result.array);
        result.method();
    }
}
