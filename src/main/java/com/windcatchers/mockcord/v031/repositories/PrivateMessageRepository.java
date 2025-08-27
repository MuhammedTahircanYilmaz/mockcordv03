package com.windcatchers.mockcord.v031.repositories;

import com.windcatchers.mockcord.v031.domain.entities.BaseMessage;
import com.windcatchers.mockcord.v031.domain.entities.PrivateChat;
import com.windcatchers.mockcord.v031.domain.entities.PrivateMessage;

import java.util.List;

public interface PrivateMessageRepository extends BaseMessageRepository<PrivateMessage> {
    List<PrivateMessage> findAllByPrivateChat(PrivateChat privateChat);
}
