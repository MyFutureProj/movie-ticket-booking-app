package com.example.repository;

import com.example.entity.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Ravi Panchal
 */
public interface TheatreRepository extends JpaRepository<Theatre, Integer> {
    List<Theatre> findByMovieIdAndLocationId(Integer movieId, Integer locationId);
}
