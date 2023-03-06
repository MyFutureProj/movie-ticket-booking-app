package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ravi Panchal
 */

@Entity(name="movie")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    @Column(name="movie_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name="name", length=50, nullable=false)
    private String name;

    @Column(name="language")
    private String language;

    @Column(name="certificate")
    private String certificate;

    @Column(name="visual")
    private String visual;

    @Column(name="duration")
    private int duration;

    @Column(name="reviews")
    private String reviews;

    @Column(name="description")
    private String description;

    @Column(name="type")
    private String type;

    @Column(name="running_status")
    private String runningStatus;

    public Movie(String name, String language, String certificate, String visual, int duration, String reviews, String description, String type, String runningStatus) {
        this.name = name;
        this.language = language;
        this.certificate = certificate;
        this.visual = visual;
        this.duration = duration;
        this.reviews = reviews;
        this.description = description;
        this.type = type;
        this.runningStatus = runningStatus;
    }
}
