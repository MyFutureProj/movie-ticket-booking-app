package com.example.repository;

import com.example.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Ravi Panchal
 */
@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
}
