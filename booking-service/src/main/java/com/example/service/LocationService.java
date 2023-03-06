package com.example.service;

import com.example.dto.LocationDto;
import com.example.entity.Location;
import com.example.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ravi Panchal
 */
@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public Location addLocation(LocationDto locationDto) {
        Location location = new Location();
        location.setStreet(locationDto.getStreet());
        location.setCity(locationDto.getCity());
        location.setState(locationDto.getState());
        location.setCountry(locationDto.getCountry());
        return locationRepository.save(location);
    }

    public List<Location> getAllLocations(){
        return locationRepository.findAll();
    }

    public void deleteLocation(Integer locationId){
        locationRepository.deleteById(locationId);
    }
}
