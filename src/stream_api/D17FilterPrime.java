package stream_api;

import java.util.List;
import java.util.stream.Collectors;

public class D17FilterPrime {
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

        System.out.println("List Primes: "+array);
    }

    public static void main(String[] args) {
        D17FilterPrime result = new D17FilterPrime();
        System.out.println(result.array);
        result.method();
    }
}
