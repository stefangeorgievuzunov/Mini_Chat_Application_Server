package dto;

import enums.SystemProtocolMessageTypes;

public class SystemProtocolMessage {
    private SystemProtocolMessageTypes protocolMessageType;
    private Long dataLength;
    private String data;
}
