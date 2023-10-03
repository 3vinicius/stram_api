package stream_api;

import java.util.List;

public class D1NumericOrder {
    Values values = new Values();
    List<Integer> array =  values.numbers;


    public void numericSort () {
        array.sort((a1,a2) -> Integer.compare( a1, a2));
    }




    public static void main(String[] args) {
        D1NumericOrder result = new D1NumericOrder();
        System.out.println(result.array);
        result.numericSort();
        System.out.println(result.array);
    }
}
