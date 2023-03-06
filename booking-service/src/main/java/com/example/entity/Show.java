package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author Ravi Panchal
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="shows")
public class Show {
    @Id
    @Column(name="show_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name="show_datetime")
    private Timestamp showDateTime;

    @Column(name="movie_id")
    private Integer movieId;

    @Column(name="theatre_id")
    private Integer theatreId;
}
