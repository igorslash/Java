package Pattern.Singleton.Proxy;

//В шаблоне прокси мы создаем объект,
// имеющий исходный объект, чтобы связать его функциональность с внешним миром.

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("config.txt");
        image.display();
        System.out.println("------");
        image.display();
    }
}
