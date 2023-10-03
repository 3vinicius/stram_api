package stream_api;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class D9NoRepeatNumbers {
    Values values = new Values();
    List<Integer> array = values.numbers;


    public void method() {

        AtomicBoolean result = new AtomicBoolean(false);

        this.array.stream().forEach(x -> {
            AtomicInteger count = new AtomicInteger(0);
            this.array.stream().forEach(y -> {
                if (x.equals(y)){
                    count.getAndIncrement();
                    if (Integer.compare(count.get(),2)==0){
                        result.set(true);
                    }
                }

            });
        });
        System.out.println(result.get());
    }

    public static void main(String[] args) {
        D9NoRepeatNumbers result = new D9NoRepeatNumbers();
        System.out.println(result.array);
        result.method();
    }
}
