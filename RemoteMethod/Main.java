package RemoteMethod;

//Remote Method Invocation
// RMI ты можешь научить две программы
// общаться между собой, даже если они находятся на разных компьютерах.

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import static RemoteMethod.RemoteCalc.UNIQUE_STRING;

public class Main {
    public static void main(String[] args) throws RemoteException,
            AlreadyBoundException, InterruptedException, NotBoundException {

        final RemoteCalc server = new RemoteCalc();
        //реестр удаленных объектов
        final Registry registry = LocateRegistry.createRegistry(234);
        //Заглушка (stub) инкапсулирует внутри себя весь процесс удаленного вызова
        Remote stub = UnicastRemoteObject.exportObject(server, 0);
        registry.bind(UNIQUE_STRING, stub);
        //Thread.sleep(Integer.MAX_VALUE);
        Thread.sleep(1000);
    }
}
