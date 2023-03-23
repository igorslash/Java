package FunctionInter;

public class FunctionInter {
    public static void main(String[] args) {
        Function<Integer, Integer, Integer> function = (num, num1) -> num * num1;
        System.out.println(function.inter(23, 45));
    }
}
@FunctionalInterface
interface Function<T1, T2, R> {
    R inter(T1 num, T2 num1);
}