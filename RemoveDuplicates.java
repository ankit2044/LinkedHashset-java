package Linked_Hashset;
import java.util.*;

//Remove Duplicates: Write a program that:
//
//Takes an array of numbers with duplicates (e.g., [1, 2, 3, 2, 1]).
//Adds each number to a LinkedHashSet to remove duplicates while preserving order.
//Prints the unique numbers in the order they were added.

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 1};

        Set<Integer> uniqueNumbers = new LinkedHashSet<>();


        for (int num : numbers) {
            uniqueNumbers.add(num);
        }

        System.out.println("Unique numbers in the order of their appearance: " + uniqueNumbers);
    }
}
