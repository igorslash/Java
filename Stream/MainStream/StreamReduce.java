package Stream.MainStream;

import java.util.ArrayList;
import java.util.List;


public class StreamReduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(45);
        list.add(70);
        int res = list.stream().reduce((integer, integer2) -> integer * integer2).get();
        System.out.println(res);
    }
}
