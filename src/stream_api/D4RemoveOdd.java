package stream_api;

import java.util.List;
import java.util.stream.Collectors;

public class D4RemoveOdd {
    Values values = new Values();
    List<Integer> array = values.numbers;


    public void method() {
        this.array = this.array.stream().filter(x -> x%2==1).collect(Collectors.toList());
        System.out.println(this.array);
    }

    public static void main(String[] args) {
        D4RemoveOdd result = new D4RemoveOdd();
        System.out.println(result.array);
        result.method();
    }
}
