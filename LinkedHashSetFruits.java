package Linked_Hashset;
import java.util.*;
//Iterate Through LinkedHashSet: Write a program that:
//
//Creates a LinkedHashSet of your favorite fruits.
//Adds at least four different fruits to the set.
//Uses a for-each loop to print each fruit.
//HashSet Questions

public class LinkedHashSetFruits {
    public static void main(String[] args) {
        // Create a LinkedHashSet of fruits
        Set<String> fruits = new LinkedHashSet<>();

        // Add at least four different fruits to the set
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");

        // Use a for-each loop to print each fruit
        System.out.println("My favorite fruits are:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
