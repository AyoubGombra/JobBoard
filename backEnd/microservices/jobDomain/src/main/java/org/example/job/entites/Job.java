package org.example.job.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Job {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;
    private String available;
    private Date date;

    public Job() {
    }

    public Job(int id, String name, String description, String available, Date date) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.available = available;
        this.date = date;
    }

    public Job(String name, String description, String available, Date date) {
        this.name = name;
        this.description = description;
        this.available = available;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
