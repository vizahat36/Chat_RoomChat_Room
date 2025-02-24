package com.chatboat.chat.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.chatboat.chat.model.chatmod;


@Controller
public class chatCon {
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages") // Fixed topic name
    public chatmod sendMessage(chatmod message) {
        return message;
    }
    @GetMapping("chat")
    public String chat() {
        return  "chat";
    }
    
}
