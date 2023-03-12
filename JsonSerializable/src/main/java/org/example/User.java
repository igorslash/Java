package org.example;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;
@JsonAutoDetect//Помечает класс как готовый к сериализациив JSON
//@JsonIgnore Свойство игнорируется при сериализации.
@JsonPropertyOrder //Позволяет задать порядок полей для сериализации.
public class User {
    private String name;
    private int age;
    private int weight;

    public User(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    @JsonProperty("igor")// Позволяет задать другое имя поля при сериализации
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && weight == user.weight && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }
}
