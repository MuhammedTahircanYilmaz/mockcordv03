package com.windcatchers.mockcord.v031.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="private_messages")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrivateMessage extends BaseMessage{

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private PrivateChat privateChat;

}
