package Работа_с_файлами;

import java.io.*;

public class SimpleDataOutputStream {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
        DataInputStream in = new DataInputStream(new FileInputStream("data.txt"));
        out.writeShort(1000);
        out.writeByte(2);
        out.writeChar(1);
        out.writeLong(214L);
        out.flush();//обязательное очищение буфера
        System.out.println(in.readShort());
        System.out.println(in.readByte());
        in.close();
    }
}
