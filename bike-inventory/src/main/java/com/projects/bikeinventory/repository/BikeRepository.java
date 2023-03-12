package com.projects.bikeinventory.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.projects.bikeinventory.pojo.Bike;

@Repository
public class BikeRepository {
    
    public List<Bike> bikes = new ArrayList<>();

    public List<Bike> getAllBikes() {
        return bikes;
    }
    public Bike getBike(int index) {
        return bikes.get(index);
    }
    
    public void saveBike(Bike bike) {
        bikes.add(bike);
    }

    public void updateBike(int index, Bike bike) {
        bikes.set(index, bike);
    }
    
    public void deleteBike(int index) {
        bikes.remove(index);
    }

}
