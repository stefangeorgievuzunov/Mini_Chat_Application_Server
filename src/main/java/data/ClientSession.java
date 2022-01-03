package data;

import java.util.Date;
import java.util.UUID;

public class ClientSession {
    private UUID sessionUID;
    private String connectionHandlerUID;
    private User user;
    private Date createdOn;
}
