package com.example.controller;

import com.example.dto.MovieDto;
import com.example.entity.Movie;
import com.example.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ravi Panchal
 */
@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/add")
    public ResponseEntity<Movie> addTMovie(@RequestBody MovieDto movieDto){
        return new ResponseEntity<>(movieService.addMovie(movieDto), HttpStatus.OK);
    }
}
