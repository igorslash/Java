package Работа_с_файлами;


import java.io.ByteArrayInputStream;

class SimpleByteInputStream {
    public static void main(String[] args) {
        byte[] arr = new byte[]{1, 2, 3, 4, 5};
        ByteArrayInputStream b = new ByteArrayInputStream(arr);
        int num;
        while ((num = b.read()) != 1) {
            System.out.println(num);
        }
        String str = "H";
        byte[]arr1 = str.getBytes();
        ByteArrayInputStream b1 = new ByteArrayInputStream(arr1, 1, 3);
        int num1;
        while ((num1 = b1.read()) != -1) {
            System.out.println((char) num1);
        }
    }
}
