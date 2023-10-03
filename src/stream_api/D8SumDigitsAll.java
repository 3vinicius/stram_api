package stream_api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class D8SumDigitsAll {
    Values values = new Values();
    List<Integer> array = values.numbers;


    public void method() {

        int result;

        result = array.stream().map(x -> {
            if (x<10){
                return x;
            }
            int multpleTen = 10;
            while (true) {

                if (x/multpleTen < multpleTen){
                    return x/multpleTen + x%multpleTen;
                }
                multpleTen +=10;
            }
        }).collect(Collectors.toList()).stream().reduce(0,(x,y) -> x+y);

        System.out.println(result);
    }

    public static void main(String[] args) {
        D8SumDigitsAll result = new D8SumDigitsAll();
        System.out.println(result.array);
        result.method();
    }
}
