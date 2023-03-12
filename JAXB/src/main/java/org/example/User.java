package org.example;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;
@XmlType(name = "User")
@XmlRootElement
@Data
public class User {
    @XmlElement//Поле будет представлено в XML-элементом.
    //Позволяет задать имя для тэга.
    @XmlAttribute//Позволяет задать имя для атрибута.
    private String name;
    private int age;

    private int weight;

    public User() {}
    public User(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
