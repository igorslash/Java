package CodingEncoding;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.UUID;

public class CodingEnc {
    public static void main(String[] args) {
        StringBuilder buffer = str();
        byte[] encodeBytes = buffer.toString().getBytes(StandardCharsets.UTF_8);
        String decodeBytes = Arrays.toString(Base64.getMimeDecoder().decode(encodeBytes));
        System.out.println(decodeBytes);


        String str = "input";
        String encoder = Base64.getEncoder()
                .encodeToString(str.getBytes(StandardCharsets.UTF_16));
        byte[] decoded = Base64.getDecoder().decode(encoder);
        String decoderString = new String(decoded);
        System.out.println(decoderString);



        //Кодировка Без Заполнения
        String encoding = Base64.getEncoder().withoutPadding().encodeToString(
                str.getBytes(StandardCharsets.UTF_8));




        //Кодировка URL-адресов
        String url = "https://music.yandex.ru/home?utm_source=main_stripe_big";
        String encodedUrl = Base64.getUrlEncoder().encodeToString
                (url.getBytes(StandardCharsets.UTF_8));
        byte[] decodedURL = Base64.getUrlDecoder().decode(encodedUrl);
        System.out.println(Arrays.toString(decodedURL));
    }


    //Кодировка различных типов данных по электронной почте
    private static StringBuilder str() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++ ) {
            sb.append(UUID.randomUUID());
        }
        return sb;
    }
}
