package URL;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;

public class GetUrl {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://school.etokursy.ru/wpm/start/");
        InputStream inputStream = url.openStream();
        byte[] bytes = inputStream.readAllBytes();
        System.out.println(Arrays.toString(bytes));
        inputStream.close();
    }
}
