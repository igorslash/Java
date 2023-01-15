package RemoteMethod;

import java.rmi.RemoteException;

public class RemoteCalc implements Calc{
    //уникальное имя удаленного объекта
    public static final String UNIQUE_STRING = "server.calc";
    @Override
    public int multiple(int x, int y) throws RemoteException {
        return x + y / x;
    }
}
