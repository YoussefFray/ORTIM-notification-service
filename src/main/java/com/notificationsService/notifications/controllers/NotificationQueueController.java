package com.notificationsService.notifications.controllers;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.notificationsService.notifications.entities.NotificationQueue;
import com.notificationsService.notifications.services.NotificationQueueService;

import java.util.List;

@RestController
@RequestMapping("/api/notification-queue")
public class NotificationQueueController {

    @Autowired
    private NotificationQueueService notificationQueueService;

    @GetMapping
    public List<NotificationQueue> getAllQueueItems() {
        return notificationQueueService.getAllQueueItems();
    }

    @PostMapping
    public NotificationQueue addQueueItem(@RequestBody NotificationQueue queueItem) {
        return notificationQueueService.saveQueueItem(queueItem);
    }
}
