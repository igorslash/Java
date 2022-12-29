package Stream.MainStream;


import java.util.Arrays;

public class StreamFlatMap {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};
        int[] newArr = Arrays.stream(arr)
                .flatMapToInt(i -> Arrays.stream(i))//(ClassArrays::Stream) //преобразовываем IntStream<int[]> в IntStream
                .toArray(); // преобразовываем IntStream в int[]
        System.out.println(Arrays.toString(newArr));
    }
}

