package com.projects.bikeinventory.exception;

public class BikeNotFoundException extends Exception {
    
    public BikeNotFoundException() {
        super("The bike you are looking for does not exist in our records.");
    }

}
