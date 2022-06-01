package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Reflection {
    public static void main(String[] args) {
        //interface reflection
        java.lang.Class<?> cls = ArrayList.class;
        java.lang.Class<?>[] ifs = cls.getInterfaces();
        System.out.println("List interfaces");
        for (java.lang.Class<?> ifc: ifs) {
            System.out.println(ifc.getName());
        }
        //constructor reflection
        java.lang.Class<?> clc = Object.class;
        Constructor[] constructors = clc.getConstructors();
        for (Constructor constructor: constructors) {
            java.lang.Class[] param = constructor.getParameterTypes();
            for (java.lang.Class<?> params: param) {
                System.out.println(params.getName());
            }
        }
        //поля Class
        //Методы getField() и getFields() возвращают только открытые члены данных класса. Чтобы получить
        // все поля класса, включая закрытые и защищенные, необходимо использовать методы getDeclaredField()
        // и getDeclaredFields().
        // Данные методы работают точно так же, как и их аналоги getField() и getFields().
        java.lang.Class<?> clf = Object.class;
        Field[]fields = clf.getFields();
        for (Field field: fields) {
            java.lang.Class<?> fld = field.getType();
            System.out.println(field.getName());//получить имя
            //тип и модификаторы
            System.out.println(fld.getName()); //получить поля
        }
        //Method Class
        java.lang.Class<?> clm = Object.class;
        Method[]methods = clm.getMethods();
        for (Method method:methods) {
            System.out.println(method.getName());
            System.out.println(method.getReturnType().getName());
        }

    }
}
