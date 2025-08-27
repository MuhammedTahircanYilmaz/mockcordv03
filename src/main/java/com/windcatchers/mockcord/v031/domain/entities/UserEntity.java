package com.windcatchers.mockcord.v031.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name="user_entities")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity extends BaseEntity{

    @Column(name="username", nullable = false, unique = true)
    private String username;

    @Column(name="email", nullable = false, unique = true)
    private String email;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="birthday")
    private Date birthday;

    @OneToMany(mappedBy = "sender", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PrivateMessage> privateMessages;

    @Column(name="inbox")
    private Inbox inbox;
}
