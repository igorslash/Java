package Работа_с_файлами;

import java.io.*;
import java.nio.file.Path;

class Bufferead {
    public static void main(String[] args) throws IOException {

        System.out.println(getFile(new File("C:\\Users\\12\\IdeaProjects" +
                "\\TrainingJava\\target.txt").toPath()));
        ///////////////////////////////////////////////////////////////////////

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine();
            System.out.println(str);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            br.close();
        }
        //System.in bytes
        int i = System.in.read();
        System.out.println(i);
        System.out.println((double) i);
    }
    /////////////////////////////////////////////////////////////////////////////////
    public static String getFile(Path file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file.toFile()));
        return br.readLine();
    }
}

