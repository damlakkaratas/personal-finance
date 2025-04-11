package com.personalfinance.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import java.math.BigDecimal;

@Entity
@Table(name = "transaction")
@Getter
@Setter

public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal amount;
    private String category;
    private String description;
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "user_id") //transaction tablosunda foreign key kolon ismi
    private User user;

    @Enumerated(EnumType.STRING)
    private TransactionType type;

}