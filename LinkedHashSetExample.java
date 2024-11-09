package Linked_Hashset;

import java.util.*;

//Adding and Removing Elements: Write a program that:
//
//Creates a LinkedHashSet of strings.
//Adds three colors to the set (e.g., "Red", "Green", "Blue").
//Removes one color from the set.
//Prints the remaining elements.

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet of Strings
        Set<String> colors = new LinkedHashSet<>();

        // Add three colors to the set
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Remove one color from the set
        colors.remove("Green");

        // Print the remaining elements
        System.out.println("Remaining colors: " + colors);
    }
}

