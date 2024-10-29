package com.notificationsService.notifications.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notificationsService.notifications.entities.UserNotification;

@Repository
public interface UserNotificationRepository extends JpaRepository<UserNotification, Long> {
}
