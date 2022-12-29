package URL;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class ConnectionUrl {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://school.etokursy.ru/wpm/start/");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        OutputStream out = connection.getOutputStream();
        out.write(23);
        InputStream input = connection.getInputStream();
        int data = input.read();
        out.close();
        System.out.println(data);

    }
}
