package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Ravi Panchal
 */
@Entity(name="offers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Offers {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name="offer_code")
    private String offer_code;

    @Column(name="valid_till")
    private Date validTill;

    @Column(name="discount")
    private String discount;
}
