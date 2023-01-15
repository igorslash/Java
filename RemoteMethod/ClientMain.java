package RemoteMethod;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import static RemoteMethod.RemoteCalc.UNIQUE_STRING;

public class ClientMain {
    public static void main(String[] args) throws NotBoundException, RemoteException {
        final Registry registry = LocateRegistry.getRegistry(234);
        Calc calc = (Calc) registry.lookup(UNIQUE_STRING);
        int result = calc.multiple(23, 56);
        System.out.println(result);
    }
}
