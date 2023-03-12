package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class App
{
    public static void main(String[] args ) throws IOException {
        User user = new User("igor", 38, 185);
        StringWriter sw = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(sw, user);
        System.out.println(sw);

        ///////////////////////////////////////////////////////////
        // десериализация
        String json = "{\"name\":\"igor\",\"age\":38,\"weight\":185}";
        StringReader stringReader = new StringReader(json);
        ObjectMapper mapperDeserializer = new ObjectMapper();
        User userDeserializer = mapperDeserializer.readValue(stringReader, User.class);
        System.out.println(userDeserializer);
    }
}
