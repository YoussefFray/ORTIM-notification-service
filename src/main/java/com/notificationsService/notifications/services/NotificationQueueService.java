package com.notificationsService.notifications.services;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notificationsService.notifications.entities.NotificationQueue;
import com.notificationsService.notifications.repositories.NotificationQueueRepository;

import java.util.List;

@Service
public class NotificationQueueService {

    @Autowired
    private NotificationQueueRepository notificationQueueRepository;

    public List<NotificationQueue> getAllQueueItems() {
        return notificationQueueRepository.findAll();
    }

    public NotificationQueue saveQueueItem(NotificationQueue queueItem) {
        return notificationQueueRepository.save(queueItem);
    }
}
