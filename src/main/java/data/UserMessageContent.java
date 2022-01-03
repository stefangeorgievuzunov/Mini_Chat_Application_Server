package data;

import enums.UserMessageContentTypes;

public class UserMessageContent {
    private Long id;
    private UserMessage message;
    private UserMessageContentTypes contentType;
    private byte[] contentData;
}
