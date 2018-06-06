package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// creates a local instance of a HashMap class called "map"
        HashMap<String, String> map = new HashMap <String, String>();
        //Assign key to value pairs
        map.put("cat", "Meow");
        map.put("ape", "squek");
        map.put("dog", "Woof");
        map.put("bat", "Squeak");
        System.out.println("map = " + map);
        // print out the map object = {key = value1 , key = value2....}
        System.out.println("A cat says ... " + map.get("cat"));
        //get the value where key ="cat" inside of the map object returns null if key does not exit.
        System.out.println("A dog says ... " + map.get("dog"));

        // iterating over values only..(looping the map object using a "for each loop & print out all values)
        for (String value : map.values()) {
            System.out.println("Value = " + value);
        }
        for (String key : map.keySet()){
            System.out.println("Key = " + key);
        }
        System.out.println();
        System.out.println("iterating over keys and values");

        for (String key : map.keySet()){
            System.out.println(key + "\t" + map.get(key));
        }
        System.out.println();




    }
}
