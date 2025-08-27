package com.windcatchers.mockcord.v031.repositories;

import com.windcatchers.mockcord.v031.domain.entities.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity, String> {
    List<UserEntity> findAllByUsernameLike(String username);
    UserEntity findByUsernameOrEmail(String username, String email);
}
