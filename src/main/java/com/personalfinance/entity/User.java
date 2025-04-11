package com.personalfinance.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Table(name="users")
@Getter
@Setter

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //id auto increment
    private Long id;
    private String name;

    @Column(unique = true) // email tekil olsun

    private String email;
    private String password;
    private LocalDateTime createdAt;


}