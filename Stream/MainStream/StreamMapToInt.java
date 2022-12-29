package Stream.MainStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapToInt {
    public static void main(String[] args) {
        List<Program> persons = new ArrayList<>();
        persons.add(new Program("I", 1));
        persons.add(new Program("T", 2));
        persons.add(new Program("I", 4));
        List<Integer> list = persons.stream()
                .mapToInt(e ->
                e.getAge())
                .boxed()
                // Возвращает поток, состоящий из элементов этого потока, каждый
                // из которых упакован в целое число.
                .collect(Collectors.toList());
        //sum(), average, min, max
    }
}
