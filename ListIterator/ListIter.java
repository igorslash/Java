package ListIterator;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIter {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 9);
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Integer i = listIterator.next();
            listIterator.set(i);
        }
        while (listIterator.hasPrevious()) {
            Integer element = listIterator.previous();
            System.out.printf("%d, %d", element, listIterator.next());
        }
    }
}
