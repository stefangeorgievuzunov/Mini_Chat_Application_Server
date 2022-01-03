import services.core.ConnectionHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatConnectionsListener {
    private final static int PORT_NUMBER = 1234;

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT_NUMBER);

        while (true) {
            //blocks until incoming connection.
            Socket socketConnection = serverSocket.accept();

            ConnectionHandler connectionHandler = new ConnectionHandler(socketConnection);

            Thread connectionThread = new Thread(connectionHandler);
            connectionThread.start();
        }
    }
}
