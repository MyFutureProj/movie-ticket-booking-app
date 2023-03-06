package com.example.controller;

import com.example.dto.TheatreDto;
import com.example.entity.Theatre;
import com.example.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ravi Panchal
 */
@RestController
@RequestMapping("/theatre")
public class TheatreController {

    @Autowired
    private TheatreService theatreService;

    @PostMapping("/add")
    public ResponseEntity<Theatre> addTheatre(@RequestBody TheatreDto theatreDto){
        return new ResponseEntity<>(theatreService.addTheatre(theatreDto), HttpStatus.OK);
    }

    @GetMapping("movie/{movieId}/location/{locationId}")
    public ResponseEntity<List<Theatre>> getTheatresByMovie(Integer movieId, Integer locationId){
        return new ResponseEntity<>(theatreService.findByMovieIdAndLocationId(movieId, locationId), HttpStatus.OK);
    }

}
