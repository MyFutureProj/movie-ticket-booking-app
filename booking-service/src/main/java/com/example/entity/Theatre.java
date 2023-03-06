package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Ravi Panchal
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="theatre")
public class Theatre {

    @Id
    @Column(name="theatre_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name="theatre_name")
    private String theatreName;

    @Column(name="total_screens")
    private String totalScreens;

    @Column(name="location_id")
    private Integer locationId;

    @Column(name="partner_id")
    private Integer theatrePartner;

    private List<Integer> movieIds;

}
