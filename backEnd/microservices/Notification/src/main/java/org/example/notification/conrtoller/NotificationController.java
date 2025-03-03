package org.example.notification.conrtoller;

import org.example.notification.entities.Notification;
import org.example.notification.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Notification")
public class NotificationController {
    @Autowired
    NotificationService notificationService;

    @PostMapping("/addNotification")
    public Notification addNotification(@RequestBody Notification notification) {
        return notificationService.addNotification(notification);
    }


    @GetMapping("/findAll")
    public List<Notification> getAllNotification() {
        return notificationService.getAllNotification();
    }

    @PutMapping("/updateNotification/{id}")
    public Notification updateNotification(@PathVariable Integer id, @RequestBody Notification notification) {

        notification.setId(id);
        return notificationService.updateNotification(notification);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteNotification(@PathVariable Integer id) {
        notificationService.deleteNotification(id);
    }
}
