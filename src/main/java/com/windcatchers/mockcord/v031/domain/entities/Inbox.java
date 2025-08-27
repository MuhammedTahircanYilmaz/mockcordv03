package com.windcatchers.mockcord.v031.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name="inboxes")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inbox extends BaseEntity{

    @Column(name="user_entity", nullable = false, unique = true)
    private UserEntity user;

    @Column(name="private_chats")
    private List<PrivateChat> privateChats;
}
