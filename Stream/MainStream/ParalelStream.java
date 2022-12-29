package Stream.MainStream;

import java.util.ArrayList;
import java.util.List;

public class ParalelStream {
    public static void main(String[] args)  {
        List<Double> list = new ArrayList<>();
        list.add(2.4);
        list.add(10.9);
        list.add(20.9);
        list.add(45.5);
        double res = list.parallelStream()
                .reduce((aDouble, aDouble2) -> aDouble + aDouble2).get();
        System.out.println(res);
    }
}
