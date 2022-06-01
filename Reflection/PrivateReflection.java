package Reflection;

import java.lang.reflect.Field;

//изменения значения закрытого поля класса

//Чтобы изменить значение закрытого (private) поля класса необходимо получить
// это поле методом getDeclaredField () и вызвать метод setAccessible (true) объекта Field,
// чтобы открыть доступ к полю. После этого значение закрытого поля можно изменять,
// если оно не final. В следующем примере определен внутренний класс
// PrivateFinalFields с набором закрытых полей; одно из полей final.
// При создании объекта класса поля инициализируются.
// В методе main примера поочередно в закрытые поля вносятся изменения и свойства объекта выводятся в консоль

public class PrivateReflection {
    public static  void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Private pr = new Private();
        Field f = pr.getClass().getDeclaredField("i");
        f.setAccessible(true);
        f.setInt(pr, 4);
        System.out.println(pr + "4");

        f = pr.getClass().getDeclaredField("s");
        f.setAccessible(true);
        f.set(pr, "R");
        System.out.println(pr + "R");

        f = pr.getClass().getDeclaredField("s2");
        f.setAccessible(true);
        f.set(pr, "MODIFY S2");

        f = pr.getClass().getDeclaredField("s");
        f.setAccessible(true);
        f.set(pr, "<e>");
        System.out.println(pr + "<e>");
    }
}
class Private {
    private final int i = 1;
    private final String s = "S";
    private final String s2 = "s";

    @Override
    public String toString() {
        return "Private{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", s2='" + s2 + '\'' +
                '}';
    }
    public Private() {}
}


