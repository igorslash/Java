package BitsOperation;

import java.util.BitSet;

public class Bits {
    public static void main(String[] args) {
        BitSet bits = new BitSet(22);
        BitSet bits2 = new BitSet(45);
        for (int i = 0; i < 22; i++) {
            if ((i % 3) == 0) {
                bits.set(i);
                bits2.xor(bits);
                bits2.and(bits);
                bits2.andNot(bits);
                bits2.or(bits);
                System.out.println(bits2);
            }
        }
    }
}
