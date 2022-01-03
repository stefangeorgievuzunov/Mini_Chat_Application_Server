package data;

import enums.MessageStatus;
import enums.ConfirmationMessageTypes;

import java.util.Date;

public class ConfirmationMessage {
    private Long id;
    private UserMessage confirmedUserMessage;
    private Date createdOn;
    private Date updatedOn;
    private MessageStatus messageStatus;
    private Long numberOfSendingAttempts;
    private ConfirmationMessageTypes confirmationMessageType;
}
