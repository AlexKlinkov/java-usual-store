package com.effectiveMobile.startUp.repositories;

import com.effectiveMobile.startUp.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByUser_Id(Long userId);
}

