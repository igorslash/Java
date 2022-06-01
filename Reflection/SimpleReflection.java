package Reflection;

import java.util.Map;

public class SimpleReflection {
    public static void main(String[] args) {
        // 1 getClass
        SimpleReflection sr = new SimpleReflection();
        java.lang.Class<? extends SimpleReflection> cl = sr.getClass();
        int[] arr = new int[10];
        java.lang.Class<? extends int[]> cl1 = arr.getClass();//1 способ
        java.lang.Class<? extends String> cl2 = "world".getClass();//2 способ
        java.lang.Class<? extends Integer> cl3 = Integer.valueOf(5).getClass();
        System.out.println(cl);
        System.out.println(cl2);
        System.out.println(cl3);

        //2
        java.lang.Class<SimpleReflection> cl4 = SimpleReflection.class;
        java.lang.Class<int[]> cl5 = int[].class;

        //3
        java.lang.Class<? super Integer> cl6 = Integer.class.getSuperclass();
        //4
        java.lang.Class<?> cl7 = Map.Entry.class.getEnclosingClass();
    }
}
