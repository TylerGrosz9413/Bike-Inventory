package com.projects.bikeinventory.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projects.bikeinventory.exception.BikeNotFoundException;
import com.projects.bikeinventory.pojo.Bike;
import com.projects.bikeinventory.service.BikeService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class BikeController {

    @Autowired
    BikeService bikeService;

    @GetMapping("/bike/all")
    public ResponseEntity<List<Bike>> getAllBikes() {
    List<Bike> bikes = bikeService.getAllBikes();
    return new ResponseEntity<>(bikes, HttpStatus.OK);
    }

    @GetMapping("/bike/{id}")
    public ResponseEntity<Bike> getBike(@PathVariable String id) throws BikeNotFoundException {
    Bike bike = bikeService.getBikeById(id);
    return new ResponseEntity<>(bike, HttpStatus.OK);
    }

    @PostMapping("/bike")
    public ResponseEntity<HttpStatus> createBike(@RequestBody Bike bike) {
        bikeService.saveBike(bike);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/bike/{id}")
    public ResponseEntity<Bike> updateBike(@PathVariable String id, @RequestBody Bike bike) throws BikeNotFoundException {
        bikeService.updateBike(id, bike);
        return new ResponseEntity<Bike>(bikeService.getBikeById(id), HttpStatus.OK); 
    }

    @DeleteMapping("/bike/{id}")
    public ResponseEntity<HttpStatus> deleteBike(@PathVariable String id) throws BikeNotFoundException {
        bikeService.deleteBike(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}
