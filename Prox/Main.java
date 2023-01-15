package Prox;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Server server = new Server(245);
        ClassLoader classLoader = server.getClass().getClassLoader();
        Class[] interfaces = server.getClass().getInterfaces();
        Block serverProxy = (Block) Proxy.newProxyInstance(classLoader, interfaces,
                new ServerHandler(server));
        serverProxy.work(server.getDataBase());
    }
}
