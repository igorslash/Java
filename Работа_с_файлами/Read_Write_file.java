package Работа_с_файлами;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Read_Write_file {
    public static void main(String[] args) throws IOException {
       // String separator = File.separator;//определение какая ос
        //String path = separator + "Desktop" + "12" + "book";//путь до файла
        File file = new File("UpCast");
        //File file = new File("/");//путь до файла
        //запись в файл
        PrintWriter pw = new PrintWriter(file);

        Scanner scanner = new Scanner(file);
        // String line = scanner.nextLine();
        pw.println("Test");
        //String[] numbers = line.split("-");
        //System.out.println(ClassArrays.toString(numbers));
        scanner.close();//close scanner
        pw.close();


        File f = new File("C:\\Users\\12\\IdeaProjects\\TrainingJava\\target.txt");
        Path path = Path.of(String.valueOf(f));
        Files.writeString(path, "1323");
        System.out.println(f);


        //

    }
}
