package com.Ramzi.locationVoiture.security.services;

import com.Ramzi.locationVoiture.models.Location;

import java.util.List;

public interface LocationService {

    List<Location> getAllLocation();
    Location createLocation(Location location);

    Location getLocationByID(Long id);
    Location updateLocation(Location location);

    void deleteLocation(Long id);
}

