package org.example.meeting.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Meeting {
    @Id
    @GeneratedValue
    private Integer id;
    private String Refernce;
    private  String Link;
    private String Status;

    public Meeting() {
    }

    public Meeting(Integer id, String refernce, String link, String status) {
        this.id = id;
        Refernce = refernce;
        Link = link;
        Status = status;
    }

    public Meeting(String refernce, String link, String status) {
        Refernce = refernce;
        Link = link;
        Status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRefernce() {
        return Refernce;
    }

    public void setRefernce(String refernce) {
        Refernce = refernce;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
