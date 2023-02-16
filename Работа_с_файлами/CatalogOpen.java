package Работа_с_файлами;

import java.io.File;
import java.util.Objects;

public class CatalogOpen {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\12\\IdeaProjects" +
                "\\TrainingJava\\src\\Многопоточность");
        readFiles(file);
    }
    public static void readFiles(File directory) {
        if (directory.isDirectory()) {
            for (File file : Objects.requireNonNull(directory.listFiles())) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                }else {
                    System.out.println(file.getName());
                    readFiles(file);
                }
            }
        }
    }
}


