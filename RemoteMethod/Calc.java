package RemoteMethod;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calc extends Remote {
    int multiple(int x, int y) throws RemoteException;;
}
