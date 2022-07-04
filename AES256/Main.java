package AES256;

import AES256.Aes256Class;

import javax.crypto.Cipher;

public class Main {
    public static void main(String[] args) {
        Aes256Class aes256 = new Aes256Class();
        String mes = "Hello";
        for (int i = 0; i < 3; i++) {
            byte[] shifr = aes256.makeAes(mes.getBytes(), Cipher.ENCRYPT_MODE);
            System.out.println(new String(shifr));
            byte[] src = aes256.makeAes(shifr, Cipher.DECRYPT_MODE);
            System.out.println(new String(src));
        }
    }
}