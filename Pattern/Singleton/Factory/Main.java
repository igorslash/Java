package Pattern.Singleton.Factory;

public class Main {
    public static void main(String[] args) {
        Game game = Factor.createPerson(Property.MAG);
        System.out.println(game);
    }
}
