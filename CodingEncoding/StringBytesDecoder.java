package CodingEncoding;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class StringBytesDecoder {
    public static void main(String[] args) {
        String str = "test";
        byte[] res = str.getBytes(StandardCharsets.UTF_16);
        System.out.println(Arrays.toString(res));

        //
        String originalInput = "dGVzdCBpbnB1dA==";
        byte[] decoded = Base64.getDecoder().decode(originalInput);
        System.out.println(Arrays.toString(decoded));
    }
}
