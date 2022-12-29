package Stream.MainStream;

import java.util.ArrayList;
import java.util.List;

public class StreamLimitSkip {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(45);
        list.add(70);
        list.stream().filter(x -> x < 20).limit(2).forEach(System.out::println);
        list.stream().filter(x -> x < 10).skip(2).forEach(System.out::println);//пропускаеет 2 оставшихся
    }
}
