package Pattern.Singleton;
public class Single {
    public static void main(String[] args) {
        Sun sunSun = Sun.getName();
        System.out.println(sunSun);
    }
}
final class Sun {
    private static Sun name;

    private Sun() {
    }

    public static Sun getName() {
        if (name == null) {
            synchronized (Sun.class) {
                if (name == null) {
                    name = new Sun();
                }
            }
        }
        return name;
    }
}

