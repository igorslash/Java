package Работа_с_файлами;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

//class SimpleErr {
//    public static void main(String[]args)  {
//        try {
//            InputStream inputStream = new FileInputStream("D");
//            System.out.println("file open");
//        }catch (FileNotFoundException e) {
//            System.err.println("File opened error");
//            e.printStackTrace();
//        }
//
//    }
//}
class SimpleErr {
    public static void main(String[]args) throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("D");
        System.err.println("file opened error");
    }
}