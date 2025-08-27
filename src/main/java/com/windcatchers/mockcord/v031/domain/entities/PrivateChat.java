package com.windcatchers.mockcord.v031.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "private_chats")
@Entity
public class PrivateChat extends BaseEntity{

    @Column(name="user_one", nullable = false)
    private UserEntity userOne;

    @Column(name="user_two",nullable = false)
    private UserEntity userTwo;

    @OneToMany(mappedBy = "privateChat")
    private List<PrivateMessage> messages;
}
