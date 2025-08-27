package com.windcatchers.mockcord.v031.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.time.Instant;

@MappedSuperclass
@Data
public class BaseEntity {

    @Id
    @Column(name= "id")
    private String id;

    @Column(name= "created_at")
    private Instant createdAt;

    @Column(name="updated_at")
    private Instant updatedAt;

    @Column(name= "is_deleted")
    @ColumnDefault("false")
    private Boolean isDeleted;
}
