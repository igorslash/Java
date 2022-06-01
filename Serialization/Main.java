package Serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student(1, "Igor", new Student.Teacher("programmer", "Comp"));
        File f = new File("C:\\Users\\12\\IdeaProjects\\TrainingJava\\src\\Serialization\\file2.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        oos.writeObject(student);
        student = null;
        student = (Student) ois.readObject();//2
        System.out.println(student);


//        User st = (User)ois.readObject();//1
//        System.out.println(st);
    }
}
