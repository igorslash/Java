package Format16;

import java.util.Arrays;
import java.util.HexFormat;

public class Format {
    public static void main(String[] args) {
        HexFormat format = HexFormat.of();
        byte[] input = new byte[]{12, 10, 34, 78, -10};
        String hex = format.formatHex(input);
        System.out.println(hex);

        byte[] output = format.parseHex(hex);
        assert Arrays.compare(input, output) == 0;
    }
}
