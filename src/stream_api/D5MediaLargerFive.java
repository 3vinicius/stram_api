package stream_api;

import java.util.List;
import java.util.stream.Collectors;

public class D5MediaLargerFive {
    Values values = new Values();
    List<Integer> array = values.numbers;


    public void method() {
        // this.array = this.array.stream().filter(x -> x>5).reduce(0,(x,y) -> (x+y)/2).collect(Collectors.toList());
        System.out.println(this.array.stream().filter(x -> x > 5).reduce(0, Integer::sum) / this.array.stream().filter(x -> x > 5).count());
    }

    public static void main(String[] args) {
        D5MediaLargerFive result = new D5MediaLargerFive();
        System.out.println(result.array);
        result.method();
    }
}
