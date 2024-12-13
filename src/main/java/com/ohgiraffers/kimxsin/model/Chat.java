package com.ohgiraffers.kimxsin.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "chats")
@Getter
@Setter
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 메시지 ID

    private String senderCode; // 보내는 사람 사원 코드

    private String receiverCode; // 받는 사람 사원 코드

    private String message; // 메시지 내용

    private Timestamp timestamp; // 전송 시간
}
