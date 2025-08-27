package com.windcatchers.mockcord.v031.repositories;

import com.windcatchers.mockcord.v031.domain.entities.BaseMessage;
import com.windcatchers.mockcord.v031.domain.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;
import java.util.List;

public interface BaseMessageRepository<T extends BaseMessage> extends JpaRepository<T,String> {
    List<T> findAllBySender(UserEntity sender);
    List<T> findAll();
    List<T> findAllByContentLike(String content);
    List<T> findAllByCreatedAtBefore(Instant createdAt);
    List<T> findAllByCreatedAtAfter(Instant createdAt);
    //List<T> findAllByChannel(ServerChannel channel);
}
