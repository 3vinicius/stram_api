package stream_api;

import java.util.List;

public class D18AllEquals {
    Values values = new Values();
    List<Integer> array = values.numbers;


    public void method() {


        System.out.println(array.stream().allMatch(x -> Integer.compare(x,array.get(0))==0));
    }

    public static void main(String[] args) {
        D18AllEquals result = new D18AllEquals();
        System.out.println(result.array);
        result.method();
    }
}
