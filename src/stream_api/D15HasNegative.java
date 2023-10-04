package stream_api;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class D15HasNegative {
    Values values = new Values();
    List<Integer> array = values.numbers;


    public void method() {

        this.array = array.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        AtomicReference<String> result = new AtomicReference<>("Not found");

        array.stream().forEach(x -> {

            if (Integer.compare(x,0) < 0){
                result.set("Has negative: " + x);
            }
        });

        System.out.println(result.get());
    }

    public static void main(String[] args) {
        D15HasNegative result = new D15HasNegative();
        System.out.println(result.array);
        result.method();
    }
}
