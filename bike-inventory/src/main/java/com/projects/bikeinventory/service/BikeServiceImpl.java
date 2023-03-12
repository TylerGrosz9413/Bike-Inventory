package com.projects.bikeinventory.service;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.bikeinventory.exception.BikeNotFoundException;
import com.projects.bikeinventory.pojo.Bike;
import com.projects.bikeinventory.repository.BikeRepository;

@Service
public class BikeServiceImpl implements BikeService {

    @Autowired
    private BikeRepository bikeRepository;

    @Override
    public Bike getBikeById(String id) throws BikeNotFoundException {
        return bikeRepository.getBike(findIndexById(id));
    }

    @Override
    public void saveBike(Bike bike) {
        bikeRepository.saveBike(bike);
    }

    @Override
    public void updateBike(String id, Bike bike) throws BikeNotFoundException {
        bikeRepository.updateBike(findIndexById(id), bike);
    }

    @Override
    public void deleteBike(String id) throws BikeNotFoundException {
        bikeRepository.deleteBike(findIndexById(id));
    }

    @Override
    public List<Bike> getAllBikes() {
        return bikeRepository.getAllBikes();
    }

    private int findIndexById(String id) throws BikeNotFoundException {
        return IntStream.range(0, bikeRepository.getAllBikes().size())
        .filter(index -> bikeRepository.getBike(index).getId().equals(id))
        .findFirst()
        .orElseThrow(() -> new BikeNotFoundException());
    }

    
    
}
