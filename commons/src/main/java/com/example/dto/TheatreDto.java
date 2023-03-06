package com.example.dto;

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
public class TheatreDto {
    private String theatreName;

    private String totalScreens;

    private Integer locationId;

    private Integer theatrePartnerId;

    private List<Integer> movieIds;
}
