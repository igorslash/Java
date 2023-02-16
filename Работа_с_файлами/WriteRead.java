package Работа_с_файлами;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteRead {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\12\\IdeaProjects\\TrainingJava\\src" +
                "\\Работа_с_файлами\\target.txt");
        Path path = Path.of(String.valueOf(file));
        Files.writeString(path, "igor 84");
        System.out.println(file);

        Writer writer = new BufferedWriter(new OutputStreamWriter
                (new FileOutputStream(file)));
        BufferedWriter bw = new BufferedWriter(writer);
        BufferedReader br = new BufferedReader(new InputStreamReader
                (new FileInputStream(file)));
        bw.write("0111");
        bw.close();
        System.out.println(br.readLine());
        br.close();

        File f = new File("user IT");
        PrintWriter printWriter = new PrintWriter(f);
        printWriter.write("C:\\Users\\12\\IdeaProjects\\TrainingJava\\" +
                "src\\Работа_с_файлами");
        printWriter.close();
        PrintStream printStream = new PrintStream(f);
        printStream.println(f);
        printStream.close();

        //Reader и Writer – это аналоги InputStream и OutputStream, но в отличие от них,
        // они работают не с байтами, а с символами. Иногда их еще называют символьными
        // потоками
        // Эти классы специально ориентированы для работы с текстом и строками
    }
}