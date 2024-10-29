package com.notificationsService.notifications;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {


@KafkaListener(topics = "orders_notification", groupId = "group_id")
    void  listener(String message)
    {
        System.out.println("Received Message in group group_id: " + message);
    }
}
