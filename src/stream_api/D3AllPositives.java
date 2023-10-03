package stream_api;

import java.util.List;

public class D3AllPositives {

    Values values = new Values();
    List<Integer> array = values.numbers;


    public void method() {
        System.out.println(this.array.stream().allMatch(x -> x>0));
    }

    public static void main(String[] args) {
        D3AllPositives result = new D3AllPositives();
        System.out.println(result.array);
        result.method();
    }
}


