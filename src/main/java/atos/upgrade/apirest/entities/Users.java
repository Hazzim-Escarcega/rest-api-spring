package atos.upgrade.apirest.entities;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
@Data
@Entity(name="users")
public class Users implements Serializable {
    @Id
    @Column(name="user_id")
    private int id;
    @Column(name="firstname")
    private String firstname;
    @Column(name="lastname")
    private String lastname;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name="updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @PrePersist
    public void prePersist() {
        this.createdAt = new Date(System.currentTimeMillis());
    }
    @PreUpdate
    public void preUpdate() {
        this.createdAt = new Date(System.currentTimeMillis());
    }




}
