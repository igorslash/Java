package Pattern.Singleton.Adapter;

public class Main {
    public static void main(String[] args) {
        IUsb adapter = new Adapter(new MemoryCard());
        adapter.connect();
    }
}
class MemoryCard {
    public void insert() {
        System.out.println("Карта памяти подключена к ПК");
    }
    public void copy() {
        System.out.println("Данные скопированы на ПК");
    }
}
interface IUsb {
    void connect();
}
class Adapter implements IUsb {
    private final MemoryCard card;

    public Adapter(MemoryCard card) {
        this.card = card;
    }

    @Override
    public void connect() {
        card.insert();
        card.copy();
    }
}
