package com.example.repository;

import com.example.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ravi Panchal
 */
public interface MovieRepository extends JpaRepository<Movie,Integer> {
    Movie findByMovieName(String name);
}
