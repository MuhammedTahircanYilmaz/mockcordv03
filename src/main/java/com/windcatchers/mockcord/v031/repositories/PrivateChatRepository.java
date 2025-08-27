package com.windcatchers.mockcord.v031.repositories;

import com.windcatchers.mockcord.v031.domain.entities.PrivateChat;
import com.windcatchers.mockcord.v031.domain.entities.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrivateChatRepository extends JpaRepository<PrivateChatRepository, String> {
    //List<PrivateChat> findAllByUserOneOrUserTwo(UserEntity userOne, UserEntity userTwo);

}
