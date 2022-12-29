package Stream.MainStream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args)  {
        List<Integer>list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(28);
        List<Integer> list2 = list.stream().map(element -> element + 2).collect(Collectors.toList());
        //System.out.println(list2);
    }
}
