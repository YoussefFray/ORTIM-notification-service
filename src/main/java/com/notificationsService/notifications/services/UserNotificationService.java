package com.notificationsService.notifications.services;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notificationsService.notifications.entities.UserNotification;
import com.notificationsService.notifications.repositories.UserNotificationRepository;

import java.util.List;

@Service
public class UserNotificationService {

    @Autowired
    private UserNotificationRepository userNotificationRepository;

    public List<UserNotification> getAllUserNotifications() {
        return userNotificationRepository.findAll();
    }

    public UserNotification saveUserNotification(UserNotification userNotification) {
        return userNotificationRepository.save(userNotification);
    }
}

