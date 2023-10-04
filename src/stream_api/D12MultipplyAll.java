package stream_api;

import java.util.List;
import java.util.stream.Collectors;

public class D12MultipplyAll {
    Values values = new Values();
    List<Integer> array = values.numbers;


    public void method() {


        System.out.println(array.stream().reduce(1,(x,y) -> x*y));
    }

    public static void main(String[] args) {
        D12MultipplyAll result = new D12MultipplyAll();
        System.out.println(result.array);
        result.method();
    }
}
