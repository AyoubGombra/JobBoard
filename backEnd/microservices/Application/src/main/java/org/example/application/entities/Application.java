package org.example.application.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Application {
    @Id
    @GeneratedValue
    private Integer id;
    private Date AppDate;
    private  String Motivation;

    public Application() {
    }

    public Application(Integer id, Date appDate, String motivation) {
        this.id = id;
        AppDate = appDate;
        Motivation = motivation;
    }

    public Application(Date appDate, String motivation) {
        AppDate = appDate;
        Motivation = motivation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAppDate() {
        return AppDate;
    }

    public void setAppDate(Date appDate) {
        AppDate = appDate;
    }

    public String getMotivation() {
        return Motivation;
    }

    public void setMotivation(String motivation) {
        Motivation = motivation;
    }
}
