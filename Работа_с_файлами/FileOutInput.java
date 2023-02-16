package Работа_с_файлами;

import java.io.*;

public class FileOutInput {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileInputStream fileInputStream = new FileInputStream("f")) {
            FileOutputStream fileOutputStream = new FileOutputStream("f");

            int i;
            while ((i = fileInputStream.read()) != -1) {
                fileOutputStream.write(i);
                fileInputStream.close();
            }
            System.out.println("done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

