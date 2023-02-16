package Работа_с_файлами;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class SimpleMoveFile {
    public static void main(String[] args) throws IOException {
        File sourcefile = new File("C:\\Users\\12" +
                "\\IdeaProjects\\TrainingJava\\source.txt");
        File targetfile = new File("C:\\Users\\12" +
                "\\IdeaProjects\\TrainingJava\\src" +
                "\\Многопоточность\\target.txt");
        Files.move(sourcefile.toPath(), targetfile.toPath());
    }
}
