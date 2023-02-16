package Pattern.Singleton.AbstractFactory;

public class SpecifiFactory1 implements IAbstractFactory{
    @Override
    public void createProductA() {
        new SpecifiProductA1();
    }

    @Override
    public void createProductB() {
        new SpecifiProductB();
    }
}
