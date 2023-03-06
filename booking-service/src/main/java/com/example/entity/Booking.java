package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ravi Panchal
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
    @Id
    @Column(name="booking_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name="total_price")
    private double totalPrice;

    @Column(name="status")
    private String status;

    @Column(name="show_id")
    private Integer showId;

    @Column(name="user_id")
    private Integer userId;

    @Column(name="payment_id")
    private Integer paymentId;

    @Column(name="offer_id")
    private Integer offerId;
}
