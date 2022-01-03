package services.core;

import exceptions.DuplicateConnectionHandlerUIDException;
import services.IInMemoryConnectionHandleService;
import services.implementations.InMemoryConnectionHandleService;

import java.net.Socket;

public class ConnectionHandler implements Runnable {
    private final Socket socketConnection;

    public ConnectionHandler(Socket socketConnection) {
        this.socketConnection = socketConnection;
    }

    @Override
    public void run() {
        if (socketConnection.isClosed())
            return;

        if (!socketConnection.isConnected())
            return;

        String connectionHandlerUID;

        try {
            connectionHandlerUID = new InMemoryConnectionHandleService().registerNewConnectionHandler(this);
        } catch (DuplicateConnectionHandlerUIDException e) {
            e.printStackTrace();
            return;
        }

        System.out.println(connectionHandlerUID);
    }
}
