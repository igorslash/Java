package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;


interface IAllFinal {
    int id = 0;
}
public class FinalMod  {
    public static void main(String[] args) throws NoSuchFieldException,
            IllegalAccessException, InterruptedException {
        Test t = new Test();
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
        t.join();
        Field f = t.getClass().getDeclaredField("id");
        f.setAccessible(true);
        f.setInt(t, f.getModifiers() & ~Modifier.FINAL);// изменение final
        Integer old = (Integer) f.get(t);
        f.setInt(t, 1);
        Integer newFinalId = (Integer) f.get(t);
        System.out.printf("id: %d", newFinalId);
    //------------------------------------------------------------------------
        Test1 test = new Test1();
        t.setDaemon(true);
        test.start();
        Field f1 = test.getClass().getDeclaredField("id");
        f1.setAccessible(true);
        f1.setInt(test, 1);
        Integer old1 = (Integer) f1.get(test);
        System.out.println(old1 + "" + Thread.currentThread().getName());
    }
}
class Test extends Thread implements IAllFinal {
    private final int id = 0;

    public Test() {}

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                '}';
    }
    public void run() {
        synchronized (Test.class) {
            System.out.println("Test sleep");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
class Test1 extends Thread implements IAllFinal {
    private final int id = 0;

    public Test1() {}

    public void run() {
        if (!isDaemon()) {
            System.out.println("start");
        }else {
            System.out.println("start test");
        }
            try {
                sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                System.out.println("finish daemon");
            }
    }
}
