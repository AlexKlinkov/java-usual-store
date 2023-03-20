package com.effectiveMobile.startUp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "users_accounts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private UserAccountStatus status;
    
    enum UserAccountStatus {
        ACTIVE,
        FROZEN,
        DELETED
    }
}
