package stream_api;

import java.util.List;
import java.util.stream.Collectors;

public class D7FindSecondLargest {
    Values values = new Values();
    List<Integer> array = values.numbers;


    public void method() {
        this.array = this.array.stream().sorted((o1, o2) -> Integer.compare(o1,o2)).collect(Collectors.toList());
        System.out.println(this.array.get(this.array.size()-2));
    }

    public static void main(String[] args) {
        D7FindSecondLargest result = new D7FindSecondLargest();
        System.out.println(result.array);
        result.method();
    }
}
