package org.example;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.StringReader;

public class UserDeserazableXml {
    public static void main(String[] args) throws JAXBException {
        String xml = """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <user>
                    <age>38</age>
                    <name>Igor</name>
                    <weight>185</weight>
                </user>""";
        StringReader stringReader = new StringReader(xml);
        JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        User user = (User) unmarshaller.unmarshal(stringReader);
        System.out.println(user);
    }
}
