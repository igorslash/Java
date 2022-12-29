package Stream.MainStream;

import java.util.stream.Stream;

public class StreamDistinctCountPeek {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 1, 3, 6 );
        stream1.distinct().forEach(System.out::println);
        System.out.println(stream1.distinct().count());
        System.out.println(stream1.distinct().peek(System.out::println).count());//1, 2, 3, 6, 4
    }
}
