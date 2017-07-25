package com.ekotwick;

/**
 * Created by ekotwick on 7/25/17.
 */
public class Planet extends HeavenlyBody {

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    // we still use the super's method for adding a satellite, but we included some validation before calling that method; anything that doesn't meet the validation is returned as false;
    public boolean addSatellite(HeavenlyBody moon) {
        if(moon.getKey().getBodyTypes() == BodyTypes.MOON) {
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }
}
