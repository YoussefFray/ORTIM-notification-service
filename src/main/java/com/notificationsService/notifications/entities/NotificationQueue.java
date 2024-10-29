package com.notificationsService.notifications.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "notification_queue")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationQueue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "notification_id", nullable = false)
    private Notification notification;

    @Enumerated(EnumType.STRING)
    private QueueStatus queueStatus;

    private LocalDateTime queuedAt;
    private LocalDateTime processedAt;

    @PrePersist
    public void onCreate() {
        this.queuedAt = LocalDateTime.now();
    }

    @PreUpdate
    public void onUpdate() {
        this.processedAt = LocalDateTime.now();
    }

    public enum QueueStatus {
        PENDING, IN_PROGRESS, COMPLETED
    }
}
