package com.example.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ravi Panchal
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="show_seat")
public class Seats {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="seat_id")
    private Integer id;

    @Column(name="seat_type_id")
    private Integer seatType;

    @Column(name="price")
    private double price;

    @Column(name="seat_num")
    private int seatNum;

    @Column(name="show_id")
    private Integer showId;

    @Column(name="booking_id")
    private Integer bookingId;

    @Column(name="is_occupied")
    private boolean isOccupied;

}
