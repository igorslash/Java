package Stream.MainStream;


import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcat {
    public static void main(String[] args)  {
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(4,5, 6);
        Stream<Integer> res = Stream.concat(stream1, stream2);
        res.forEach(System.out::println);
        System.out.println(res.collect(Collectors.toSet()));
    }
}
