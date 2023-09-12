package com.rcprdn.chatbackend.task;

import com.rcprdn.chatbackend.entity.ChatMessage;
import com.rcprdn.chatbackend.enumeration.MessageType;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ServerMessages {

    private final SimpMessagingTemplate template;

    @Scheduled(fixedDelay = 5000)
    public void scheduleFixedDelayTask() {
        ChatMessage chatMessage = new ChatMessage(MessageType.MESSAGE, "Server", "Scheduled Nachricht", null);
        this.template.convertAndSend("/topic/chat", chatMessage);
    }

}