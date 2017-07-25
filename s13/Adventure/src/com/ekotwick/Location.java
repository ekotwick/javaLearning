package com.ekotwick;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ekotwick on 7/24/17.
 */
public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
    }

    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        // we are not returning the actual exits map; we are instead returning a copy of the exits map. This is defensive: nothing outside our Location class can change our exits map.
        return new HashMap<String, Integer>(exits);
    }
}
