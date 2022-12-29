package Stream.MainStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Program>persons = new ArrayList<>();
        persons.add(new Program("I", 1));
        persons.add(new Program("T", 2));
        persons.add(new Program("I", 4));

        persons.stream()
                .filter(person -> person.getAge() >= 3)
                .sorted(Comparator.comparing(Program::getName))
                .map(Program::getName).forEach(System.out::println);
    }
}
