package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value={"createdAt", "updateAt"},
        allowGetters = true
)
public abstract class AuditModel implements Serializable {
    @Column(name = "created_at", nullable = false, updatable = false)
    @CreatedDate
    private Date createdDate;

    @Column(name = "updated_at", nullable = false)
    @CreatedDate
    private Date updatedDate;

    public Date getCreatedDate(){
        return createdDate;
    }

    public Date getUpdatedDate(){
        return updatedDate;
    }
}
