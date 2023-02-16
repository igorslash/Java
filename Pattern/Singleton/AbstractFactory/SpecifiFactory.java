package Pattern.Singleton.AbstractFactory;

public class SpecifiFactory {
    public static void main(String[] args) {
        IAbstractFactory iAbstractFactory = new SpecifiFactory1();
        iAbstractFactory.createProductA();
        iAbstractFactory.createProductB();
    }
    
}
interface ProductA {}
interface ProductB { }

