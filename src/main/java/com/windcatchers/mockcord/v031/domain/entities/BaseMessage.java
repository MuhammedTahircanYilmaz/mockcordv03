package com.windcatchers.mockcord.v031.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Data
public class BaseMessage extends BaseEntity{

    @Column(name="content", nullable = false)
    private String content;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private UserEntity sender;

}
