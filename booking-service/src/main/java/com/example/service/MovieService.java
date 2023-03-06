package com.example.service;

import com.example.dto.MovieDto;
import com.example.entity.Movie;
import com.example.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ravi Panchal
 */
@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Movie addMovie(MovieDto movieDto) {
        Movie movie = new Movie();
        movie.setCertificate(movieDto.getCertificate());
        movie.setDescription(movieDto.getDescription());
        movie.setDuration(movieDto.getDuration());
        movie.setLanguage(movieDto.getLanguage());
        movie.setName(movieDto.getName());
        movie.setReviews(movieDto.getReviews());
        movie.setType(movieDto.getType());
        movie.setVisual(movieDto.getVisual());
        return movieRepository.save(movie);

    }
}
