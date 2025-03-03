package org.example.notification.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Notification {
    @Id
    @GeneratedValue
    private Integer id;
    private String sender;
    private String recepient;
    private String content;
    private Date date;

    public Notification() {
    }

    public Notification(Integer id, String sender, String recepient, String content, Date date) {
        this.id = id;
        this.sender = sender;
        this.recepient = recepient;
        this.content = content;
        this.date = date;
    }

    public Notification(String sender, String recepient, String content, Date date) {
        this.sender = sender;
        this.recepient = recepient;
        this.content = content;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecepient() {
        return recepient;
    }

    public void setRecepient(String recepient) {
        this.recepient = recepient;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
