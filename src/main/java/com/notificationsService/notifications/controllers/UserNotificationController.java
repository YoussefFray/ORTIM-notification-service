package com.notificationsService.notifications.controllers;

 
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.notificationsService.notifications.entities.UserNotification;
import com.notificationsService.notifications.services.UserNotificationService;

import java.util.List;

@RestController
@RequestMapping("/api/user-notifications")
public class UserNotificationController {

    @Autowired
    private UserNotificationService userNotificationService;

    @GetMapping
    public List<UserNotification> getAllUserNotifications() {
        return userNotificationService.getAllUserNotifications();
    }

    @PostMapping
    public UserNotification createUserNotification(@RequestBody UserNotification userNotification) {
        return userNotificationService.saveUserNotification(userNotification);
    }
}

