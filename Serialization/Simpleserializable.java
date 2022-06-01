package Serialization;

import java.io.*;

public class Simpleserializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File f = new File("C:\\Users\\12\\IdeaProjects\\TrainingJava\\src\\Serialization\\file.txt");
        Class c = new Class(234, "Class");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        //Сереализация объекта
        oos.writeObject(c);
        c = null;
        c = (Class) ois.readObject();
        System.out.println(c);

        //Десереализация объекта
       // Class cl = (Class)ois.readObject();//Downcast Object = Class
      //  System.out.println(cl);
    }
}
class Class {
    private int id;
    private String name;

    public Class(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
