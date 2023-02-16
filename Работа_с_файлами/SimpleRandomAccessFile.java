package Работа_с_файлами;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class SimpleRandomAccessFile {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf;
        raf = new RandomAccessFile("random.txt", "rw");//rw read ili write
        raf.write(new byte[]{1, 2, 3, 4, 5, 6});
        raf.seek(5);
        raf.write(new byte[] {22, 45, 90});
        raf.seek(0);
        byte[]arr = new byte[10];
        int n = raf.read(arr, 0, 10);
        System.out.println(Arrays.toString(arr));
    }
}
