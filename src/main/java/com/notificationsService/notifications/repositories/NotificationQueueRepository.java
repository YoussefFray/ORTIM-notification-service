package com.notificationsService.notifications.repositories;

 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notificationsService.notifications.entities.NotificationQueue;

@Repository
public interface NotificationQueueRepository extends JpaRepository<NotificationQueue, Long> {
}
