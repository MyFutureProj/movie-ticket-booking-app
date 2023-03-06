package com.example.controller;

import com.example.dto.LocationDto;
import com.example.entity.Location;
import com.example.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ravi Panchal
 */
@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @PostMapping("/add")
    public ResponseEntity<Location> addLocation(@RequestBody LocationDto locationDto){
        return new ResponseEntity<>(locationService.addLocation(locationDto), HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Location>> getAllLocations(){
        return new ResponseEntity<>(locationService.getAllLocations(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{locationId}")
    public void deleteLocation(@PathVariable Integer locationId){
        locationService.deleteLocation(locationId);
    }

}
