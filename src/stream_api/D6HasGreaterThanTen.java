package stream_api;

import java.util.List;

public class D6HasGreaterThanTen {
    Values values = new Values();
    List<Integer> array = values.numbers;


    public void method() {
        //this.array = this.array.stream().
        System.out.println(this.array.stream().anyMatch(x -> x>10));
    }

    public static void main(String[] args) {
        D6HasGreaterThanTen result = new D6HasGreaterThanTen();
        System.out.println(result.array);
        result.method();
    }
}
