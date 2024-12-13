package com.ohgiraffers.kimxsin.repository;

import com.ohgiraffers.kimxsin.model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {
    List<Chat> findBySenderCodeAndReceiverCode(String senderCode, String receiverCode);
}
