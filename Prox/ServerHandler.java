package Prox;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class ServerHandler implements InvocationHandler {
    private Server server;
    public ServerHandler(Server server) {
        this.server = server;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("Server is work");
        return null;
    }
}