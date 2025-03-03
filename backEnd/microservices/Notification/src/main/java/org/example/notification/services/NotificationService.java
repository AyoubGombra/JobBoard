package org.example.notification.services;

import org.example.notification.entities.Notification;
import org.example.notification.repo.NotificationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {
    @Autowired
    NotificationRepo notificationRepo;

    public Notification addNotification(Notification notification) {
        return notificationRepo.save(notification);
    }

    public void deleteNotification(Integer idNotification) {
        notificationRepo.deleteById(idNotification);
    }

    public List<Notification> getAllNotification() {
        return notificationRepo.findAll();
    }

    public Notification updateNotification(Notification notification) {
        return notificationRepo.findById(notification.getId())
                .map(existingEvent -> {
                    existingEvent.setId(notification.getId());
                    existingEvent.setSender(notification.getSender());
                    existingEvent.setRecepient(notification.getRecepient());
                    existingEvent.setContent(notification.getContent());
                    existingEvent.setDate(notification.getDate());
                    return notificationRepo.save(existingEvent);
                })
                .orElseThrow(() -> new RuntimeException("feedback not found with id: " + notification.getId()));
    }
}
