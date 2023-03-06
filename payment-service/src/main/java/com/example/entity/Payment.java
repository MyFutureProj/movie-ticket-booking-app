package com.example.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

/**
 * @author Ravi Panchal
 */
@Entity(name="payment")
public class Payment {

    @Id
    @Column(name="movie_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name="amount")
    private double amount;

    @Column(name="date_time")
    private Timestamp dateTime;

    @Column(name="payment_method")
    private String paymentMethod;

    @Column(name="transaction_id")
    private Integer transactionId;

    @Column(name="status")
    private String status;

    @Column(name="summary")
    private String summary;
}
