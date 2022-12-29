package URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

class SimpleURL {
    public static void main(String[] args) throws IOException {
        URL apiGoogle = new URL("https://www.google.com/intl/en/privacy");
        BufferedReader bf = new BufferedReader(new InputStreamReader(apiGoogle.openStream()));
        String str;
        while ((str = bf.readLine()) != null) {
            System.out.println(str);
            bf.close();
        }
    }
}

