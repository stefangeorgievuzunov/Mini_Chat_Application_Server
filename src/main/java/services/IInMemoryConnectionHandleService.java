package services;

import exceptions.DuplicateConnectionHandlerUIDException;
import services.core.ConnectionHandler;

public interface IInMemoryConnectionHandleService {
     String registerNewConnectionHandler(ConnectionHandler connectionHandler) throws DuplicateConnectionHandlerUIDException;
}
