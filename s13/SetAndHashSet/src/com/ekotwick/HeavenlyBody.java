package com.ekotwick;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ekotwick on 7/24/17.
 */

// `final` and `private` keywords to make immutable classes
    // `final` removed, because we want to subclass this class
//public final class HeavenlyBody {
public abstract class HeavenlyBody {
    private final Key key; // this allows us to avoid having to use String and BodyTypes fields
//    private final String name;
//    private final BodyTypes bodyType;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }
//
//    public String getName() {
//        return name;
//    }
//
//    public BodyTypes getBodyType() {
//        return bodyType;
//    }


    public Key getKey() {
        return key;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    // for data privacy
    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    // for overriding the equals and hashCode method: go to the menu that generates the setters and getters.
    // but this is a manual override
    @Override
    // this method does the following: it's looking for objects that have the same name; that's the measure of equality for our purposes;
    // so first it checks to see whether the object is the same as its self; then it checks to see whether the two objects belong to the same class; then it checks to see whether they have the same name;
    // we have to cast our Object (parameter) as the argument of the type we're looking for, because that way we can be sure that they items are the same
    public final boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }


        if(obj instanceof HeavenlyBody) {
            HeavenlyBody theObject= (HeavenlyBody) obj;
            // in order to reduce duplicated code, we call the Key method here:
            return this.key.equals(theObject.getKey());
//            if(this.name.equals(theObject.getName())) {
//                return this.bodyType == theObject.getBodyType();
//            }
        }

        return false;
        // we use the above method because we are subclassing heavenly body to create moons and other objects.
//        if((obj == null) || (obj.getClass() != this.getClass())) {
//            return false;
//        }

//        String objName = ((HeavenlyBody) obj).getName();
//        return this.name.equals(objName);
    }

    @Override
    public final int hashCode() {
        // also to reduce duplication, we simply return the key hash code:
        return this.key.hashCode();
//        return this.name.hashCode() + 57 + this.bodyType.hashCode(); // provided a hashcode returns the same number for the same input, whatever will work; the 57 to guarantee that the hashcode is never non-zero;
        // the bodyType.hashCode method is called, because ENUMs have a build in hashCode. So we are hashing on the name and on the body type, which should give us unique numbers;
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyTypes + ", " + this.orbitalPeriod;
    }

    public static Key makeKey(String name, BodyTypes bodyTypes) {
        return new Key(name, bodyTypes);
    }

    // in Main.class, we are storing items in the solar system by name only. This has a disadvantage when we want to store objects that are quite complicated (and could have names that math other names). There are several solutions to this problem: (1) we create a primary key for identifying each object (as we do with databases); (2) we could concatenate the distinguishing information, so that for every object there is a unique identifying string; or we could do the following: create a key class that will generate identifying information. the key class is being stored here:

    public static final class Key {
        private String name;
        private BodyTypes bodyTypes;

        private Key(String name, BodyTypes bodyTypes) {
            this.name = name;
            this.bodyTypes = bodyTypes;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyTypes() {
            return bodyTypes;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyTypes.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if(this.name.equals(key.getName())) {
                return this.bodyTypes == key.getBodyTypes();
            }
            return false;
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyTypes;
        }
    }
}

