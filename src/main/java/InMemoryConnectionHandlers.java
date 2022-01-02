import java.util.HashMap;

public class InMemoryConnectionHandlers {
    private static InMemoryConnectionHandlers singleInstance = null;

    private final HashMap<String, Runnable> inMemoryConnectionHandlers;

    private InMemoryConnectionHandlers() {
        inMemoryConnectionHandlers = new HashMap<>();
    }

    public static InMemoryConnectionHandlers createNewInstance() {
        if (singleInstance == null)
            singleInstance = new InMemoryConnectionHandlers();

        return singleInstance;
    }

    public synchronized void addNewConnection(final String uid, final Runnable connection) {
        inMemoryConnectionHandlers.put(uid, connection);
    }

    public synchronized void removeConnectionByUID(final String uid) {
        inMemoryConnectionHandlers.remove(uid);
    }

    public Runnable getConnectionByUID(final String uid) {
        return inMemoryConnectionHandlers.get(uid);
    }
}