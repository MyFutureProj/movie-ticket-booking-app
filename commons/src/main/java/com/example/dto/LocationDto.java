package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ravi Panchal
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LocationDto {
    private String street;
    private String city;
    private String state;
    private String country;
}
