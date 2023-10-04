package stream_api;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class D19SumDivisorsOfThreeAndFive {
    Values values = new Values();
    List<Integer> array = values.numbers;


    public void method() {

        array = array.stream().filter(x -> {
            if (Integer.compare(x,0) > 0){
                return (x % 3 == 0) && (x % 5 == 0);
            }
            return false;
        }).toList();

        Optional<Integer> optionalISum = array.stream().reduce(Integer::sum);

        optionalISum.ifPresent(x -> System.out.println("Sum "+x));
        if (optionalISum.isEmpty()){
            System.out.println("Not has divisors of three and five");
        }

    }

    public static void main(String[] args) {
        D19SumDivisorsOfThreeAndFive result = new D19SumDivisorsOfThreeAndFive();
        System.out.println(result.array);
        result.method();
    }
}
