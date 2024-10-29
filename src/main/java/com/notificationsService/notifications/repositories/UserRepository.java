package com.notificationsService.notifications.repositories;

 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notificationsService.notifications.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
