package Pattern.Singleton.Bridge;

public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(23,30, 10, new RedCircle());
        Shape greenCircle = new Circle(44, 50, 60, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
