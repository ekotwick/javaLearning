package com.ekotwick;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    // our solar system is a collection of key/value pairs, the key being the name of a body, and the value being an object, which has a name, orbital period, and moon objects;
    // the planets is a set of values, namely, all the planets in the solar system (i.e., all the heavenlybodies)——but just the names, none of teh rest of the information associated with them
    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        // we will be creating a `temp` object and then rewriting it. What we do with this variable is name a space in memory for a new object and then place that object in our maps; we then reassign that value and place it in the maps/sets again. This keeps our code cleaner and doesn't have free-floating objects that can be modified. Instead, it creates an object and drops it into the immutable class, where it's more or less locked in place.
	    HeavenlyBody temp = new Planet("Mercury", 88);
	    solarSystem.put(temp.getKey(), temp);
	    planets.add(temp);

	    temp = new Planet("Venus", 255);
	    solarSystem.put(temp.getKey(), temp);
	    planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Mars", 400);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 40);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Phobos", 540);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        System.out.println("Planets");
        for(HeavenlyBody planet : planets) {
            System.out.println(planet.toString());
            System.out.println("\t" + planet.getKey());
        }

        HeavenlyBody earth = solarSystem.get(HeavenlyBody.makeKey("Mars", HeavenlyBody.BodyTypes.PLANET));
        System.out.println("Moons of " + earth.getKey());
        for(HeavenlyBody moon : earth.getSatellites()) {
            System.out.println("\t" + moon.getKey());
        }

        // here we perform a basic `union` operation among the sets; notice that there will be no duplicates
        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All moons");
        for(HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getKey());
        }

        System.out.println();
        System.out.println("The solar system contains: ");
        for(HeavenlyBody heavenlyBody : solarSystem.values()) {
            // we can just pass the object and the `toString()` method will be implicitly called
            System.out.println(heavenlyBody);
        }
    }
}
