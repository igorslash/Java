package StringTokenaizer;

import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        String str = "I want to be a programmer";
        StringTokenizer st = new StringTokenizer(str, " ");
        String[] arr = st.nextToken().trim().split("");
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("word count: " + arr.length);
    }
}
