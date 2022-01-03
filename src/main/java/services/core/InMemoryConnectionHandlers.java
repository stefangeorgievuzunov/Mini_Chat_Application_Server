package services.core;

import exceptions.DuplicateConnectionHandlerUIDException;

import java.util.HashMap;

public class InMemoryConnectionHandlers {
    private static InMemoryConnectionHandlers singleInstance = null;

    private final HashMap<String, ConnectionHandler> inMemoryConnectionHandlers;

    private InMemoryConnectionHandlers() {
        inMemoryConnectionHandlers = new HashMap<>();
    }

    public static InMemoryConnectionHandlers createNewInstance() {
        if (singleInstance == null)
            singleInstance = new InMemoryConnectionHandlers();

        return singleInstance;
    }

    public synchronized void addNewConnectionHandler(final String uid, final ConnectionHandler connectionHandler) throws DuplicateConnectionHandlerUIDException {
        if(inMemoryConnectionHandlers.containsKey(uid))
            throw new DuplicateConnectionHandlerUIDException();

        inMemoryConnectionHandlers.put(uid, connectionHandler);
    }

    public synchronized void removeConnectionHandlerByUID(final String uid) {
        inMemoryConnectionHandlers.remove(uid);
    }

    public ConnectionHandler getConnectionHandlerByUID(final String uid) {
        return inMemoryConnectionHandlers.get(uid);
    }
}