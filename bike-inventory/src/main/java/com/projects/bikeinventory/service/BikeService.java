package com.projects.bikeinventory.service;

import java.util.List;

import com.projects.bikeinventory.exception.BikeNotFoundException;
import com.projects.bikeinventory.pojo.Bike;

public interface BikeService {

    public Bike getBikeById(String id) throws BikeNotFoundException;
    public void saveBike(Bike bike);
    public void updateBike(String id, Bike bike) throws BikeNotFoundException;
    public void deleteBike(String id) throws BikeNotFoundException;
    public List<Bike> getAllBikes();
    
}
