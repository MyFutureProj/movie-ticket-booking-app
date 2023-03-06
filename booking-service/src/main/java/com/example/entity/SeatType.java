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
@Table(name="seat_type")
public class SeatType {

    @Id
    @Column(name="seat_type_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="seat_type_name")
    private String SeatTypeName;

    @Column(name="theatre_id")
    private Integer theatreId;

}


