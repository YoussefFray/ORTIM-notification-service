package com.notificationsService.notifications.repositories;

 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notificationsService.notifications.entities.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
