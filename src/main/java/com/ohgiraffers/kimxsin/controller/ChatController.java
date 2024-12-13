package com.ohgiraffers.kimxsin.controller;

import com.ohgiraffers.kimxsin.model.Chat;
import com.ohgiraffers.kimxsin.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/chat")
public class ChatController {

    @Autowired
    private ChatRepository chatRepository;

    // 메시지 전송 처리
    @MessageMapping("/send")
    @SendTo("/topic/messages")
    public Chat sendMessage(Chat chat) {
        chatRepository.save(chat); // 메시지 저장
        return chat; // 메시지 브로커를 통해 전송
    }

    // 채팅 히스토리 조회
    @GetMapping("/history/{sender}/{receiver}")
    @ResponseBody
    public List<Chat> getChatHistory(@PathVariable String sender, @PathVariable String receiver) {
        return chatRepository.findBySenderCodeAndReceiverCode(sender, receiver);
    }
}
