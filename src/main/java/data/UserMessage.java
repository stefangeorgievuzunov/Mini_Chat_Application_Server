package data;

import enums.MessageStatus;

import java.util.Date;
import java.util.List;

public class UserMessage {
    private Long id;
    private User fromUser;
    private ChatRoom chatRoom;
    private Date createdOn;
    private Date updatedOn;
    private Long numberOfSendingAttempts;
    private MessageStatus messageStatus;
    private List<ConfirmationMessage> confirmationMessages;
    private UserMessageContent messageContent;
}
