package Stream.MainStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> collect = Arrays.asList(10, 20, 20, 30)
                .stream()
                .distinct()//удаляет дубликаты
                .sorted()
                .collect(Collectors.toList());//ctrl+ alt+ v оборачивает в лист
        collect.forEach(System.out::println);

        //2
        Stream<Integer> stream = Stream.of(10, 20, 40);//ctrl+ alt+ v

        //3
        String[] arr = {"1", "2", "3", "4"};
        Stream<String> stream1 = Arrays.stream(arr);

        Stream.Builder<Object> builder = Stream.builder()
                .add(10)
                .add(20)
                .add(30);

        IntStream chars = "hello".chars();

        /*
        конвеерные операции:
         map, filter, distinct, parallel, sequential, flatMap, skip, limit

         терминальные:
         foreach, collect, min/max/sum/count, matcher(anyMatch, allMatch),
         findFirst, findAny, iterator
         */
    }
}
