package com.example.service;

import com.example.dto.TheatreDto;
import com.example.entity.Theatre;
import com.example.repository.MovieRepository;
import com.example.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author Ravi Panchal
 */
@Service
public class TheatreService {

    @Autowired
    private TheatreRepository theatreRepository;

    @Autowired
    private MovieRepository movieRepository;

    public Theatre addTheatre(TheatreDto theatreDto) {
        Theatre theatre = new Theatre();
        theatre.setTheatreName(theatreDto.getTheatreName());
        theatre.setLocationId(theatreDto.getLocationId());
        theatre.setTotalScreens(theatreDto.getTotalScreens());
        theatre.setTheatrePartner(theatreDto.getTheatrePartnerId());
        theatre.setMovieIds(theatreDto.getMovieIds());
        return theatreRepository.save(theatre);

    }

    public List<Theatre> findByMovieIdAndLocationId(Integer movieId, Integer locationId) {
        return theatreRepository.findByMovieIdAndLocationId(movieId, locationId);
    }
}
