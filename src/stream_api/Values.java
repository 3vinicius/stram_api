package stream_api;

import java.util.Arrays;
import java.util.List;

public class Values {
    List<Integer> numbers;

    public Values() {
        this.numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,2,5);
    }

    @Override
    public String toString() {
        return "Values{" +
                "numeros=" + numbers +
                '}';
    }
}
