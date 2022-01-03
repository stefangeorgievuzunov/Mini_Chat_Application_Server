package data;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class ChatRoom {
    private Long id;
    private List<User> users;
    private Date createdOn;
    private List<UserMessage> userMessages;
}
