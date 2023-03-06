package com.example.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

/**
 * @author Ravi Panchal
 */
@Entity(name="user")
public class User {

    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @NotBlank(message = "Name is mandatory")
    @Column(name="name", length=50, nullable=false)
    private String name;


    private Integer locationId;

    @Column(name="mobile")
    private String mobile;

    @Column(name="user_name")
    private String userName;

    @Column(name="password")
    private String password;

    @Column(name="salt")
    private String salt;

    @OneToOne(mappedBy = "address")
    private User user;
}
