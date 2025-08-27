package com.windcatchers.mockcord.v031.repositories;

import com.windcatchers.mockcord.v031.domain.entities.Inbox;
import com.windcatchers.mockcord.v031.domain.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InboxRepository extends JpaRepository<Inbox, String> {
    Inbox findByUser(UserEntity user);
}
