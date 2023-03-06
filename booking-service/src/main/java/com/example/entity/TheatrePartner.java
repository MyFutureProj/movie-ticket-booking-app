package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ravi Panchal
 */
@Entity(name="theatre_partner")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TheatrePartner {

    @Id
    @Column(name="partner_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name="partner_name", length=50, nullable=false)
    private String partnerName;

    @Column(name="address")
    private String address;

    @Column(name="total_theatres")
    private int totalTheatres;

    @Column(name="contact_number")
    private String contactNumber;

    @Column(name="email")
    private String email;

    @Column(name="GSTIN")
    private String GSTIN;

}
