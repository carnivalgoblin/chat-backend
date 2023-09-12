package com.rcprdn.chatbackend.entity;

import com.rcprdn.chatbackend.enumeration.MessageType;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {

    private MessageType type;

    private String user;

    private String content;

    private Date date = new Date();

}
