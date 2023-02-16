package Работа_с_файлами;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InputOutput {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\12\\IdeaProjects\\TrainingJava\\src" +
                "\\Работа_с_файлами\\target.txt");
        InputStream inputStream = Files.newInputStream(Path.of(path.toUri()));
        OutputStream outputStream = Files.newOutputStream(path);
        inputStream.close();
    }
}
