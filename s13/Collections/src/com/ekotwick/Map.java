package com.ekotwick;

import java.util.HashMap;

/**
 * Created by ekotwick on 7/24/17.
 */
public class Map {

    public static void main(String[] args) {
        // we use "java.util.Ma" because we want to use the Map collections object, but we also want to avoid name collisions with our class, which is called "Map". So we import directly from the java.util and assign that object to a variable name;
        java.util.Map<String, String> languages = new HashMap<>();

        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming langauge with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lips", "Therein lies madness");

        System.out.println(languages.get("Java"));

        System.out.println("=========");


        for(String key: languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }
    }
}
