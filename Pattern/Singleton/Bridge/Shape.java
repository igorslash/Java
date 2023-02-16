package Pattern.Singleton.Bridge;

public abstract class Shape {
    protected IDrawAPI iDrawAPI;

    public Shape(IDrawAPI iDrawAPI) {
        this.iDrawAPI = iDrawAPI;
    }
    public abstract void draw();
}
