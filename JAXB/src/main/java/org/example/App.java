package org.example;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.StringWriter;

public class App
{
    public static void main( String[] args ) throws JAXBException {
        User user = new User("Igor", 38, 185);

        StringWriter sw = new StringWriter();
        JAXBContext jaxb = JAXBContext.newInstance(User.class);
        Marshaller marshal = jaxb.createMarshaller();
        marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);//будут добавлены
        // переносы строки и пробелы, чтобы код был читабельным
        marshal.marshal(user, sw);
        System.out.println(sw);
    }
}

