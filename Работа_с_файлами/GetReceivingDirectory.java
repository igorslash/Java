package Работа_с_файлами;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetReceivingDirectory {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\12\\Desktop\\site");
        DirectoryStream<Path> directory = Files.newDirectoryStream(path, "*{book}");
        for (Path files : directory) {
            List<Path> list = new ArrayList<>();
                list.add(files);
                System.out.printf("%s, %s", Arrays.toString(files.toFile()
                        .listFiles()), list);
            }
        directory.close();
    }
}


