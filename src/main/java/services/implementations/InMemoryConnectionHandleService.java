package services.implementations;

import exceptions.DuplicateConnectionHandlerUIDException;
import services.core.ConnectionHandler;
import services.IInMemoryConnectionHandleService;
import services.core.InMemoryConnectionHandlers;

import java.util.UUID;

public class InMemoryConnectionHandleService implements IInMemoryConnectionHandleService {

    @Override
    public String registerNewConnectionHandler(ConnectionHandler connectionHandler) throws DuplicateConnectionHandlerUIDException {
        final String uid = generateNewUID();
        InMemoryConnectionHandlers inMemoryConnectionHandlers = InMemoryConnectionHandlers.createNewInstance();
        inMemoryConnectionHandlers.addNewConnectionHandler(uid, connectionHandler);

        return uid;
    }

    private String generateNewUID() {
        return UUID.randomUUID().toString();
    }
}
