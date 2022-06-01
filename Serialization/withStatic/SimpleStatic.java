package Serialization.withStatic;

import java.io.*;

public class SimpleStatic implements Serializable{
    private static int staticNumber;
    private final int nonStatic;

    public SimpleStatic(int nonStatic) {
        this.nonStatic = nonStatic;
        staticNumber = nonStatic;
    }
    public static void serializeStatic(ObjectOutputStream oos) throws IOException {
        oos.writeInt(staticNumber);
    }
    public static void deSerializeStatic(ObjectInputStream ois) throws IOException {
        staticNumber = ois.readInt();
    }
    @Override
    public String toString() {
        return staticNumber + "" + nonStatic;
    }
}
class Dispatcher {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SimpleStatic s = new SimpleStatic(10);
        System.out.println("First values " + s);
        File f = new File("C:\\Users\\12\\IdeaProjects\\TrainingJava\\src" +
                "\\Serialization\\withStatic\\test.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        oos.writeObject(s);
        SimpleStatic.serializeStatic(oos);
        s = new SimpleStatic(5);
        System.out.println("After " + s);
        SimpleStatic.deSerializeStatic(ois);
        s = (SimpleStatic) ois.readObject();
        System.out.println("After des " + s);
    }
}
