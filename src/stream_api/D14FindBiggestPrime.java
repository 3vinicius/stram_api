package stream_api;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class D14FindBiggestPrime {
    Values values = new Values();
    List<Integer> array = values.numbers;


    public void method() {

        this.array = array.stream().filter(x -> {
            int divider = 2;

            if (Integer.compare(x, 2) == 0) {
                return true;
            };

            if (Integer.compare(x, 2) < 0){
                return false;
            }

            while (Integer.compare(x, divider) != 0) {
                if (x % divider == 0) {
                    return false;
                }
                divider++;
            }
            return true;

        }).collect(Collectors.toList());

        System.out.println(array.stream().max(Comparator.naturalOrder()).stream().toList().get(0));
    }

    public static void main(String[] args) {
        D14FindBiggestPrime result = new D14FindBiggestPrime();
        System.out.println(result.array);
        result.method();
    }
}
