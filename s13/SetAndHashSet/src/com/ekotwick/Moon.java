package com.ekotwick;

/**
 * Created by ekotwick on 7/25/17.
 */
public class Moon extends HeavenlyBody {

    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }
}
