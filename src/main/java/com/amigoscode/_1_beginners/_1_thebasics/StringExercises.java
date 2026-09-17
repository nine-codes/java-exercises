package com.amigoscode._1_beginners._1_thebasics;

import java.util.Locale;

/**
 * Exercise: Strings
 * <p>
 * Learn how to work with Strings in Java.
 * Strings are objects that represent sequences of characters and come with
 * many useful built-in methods.
 */
public class StringExercises {

    public static void main(String[] args) {

        String message = "Hello, Welcome to Amigoscode!";
        String padded = "   Hello World   ";
        String csv = "apple,banana,cherry,date,elderberry";

        // TODO: 1 - Get the length of the 'message' string and print it
        // Hint: Use the .length() method
        System.out.printf("Message length: %d\n", message.length());


        // TODO: 2 - Convert 'message' to uppercase and lowercase, and print both
        // Hint: Use .toUpperCase() and .toLowerCase()
        System.out.printf("%s | %s\n", message.toUpperCase(), message.toLowerCase());


        // TODO: 3 - Get a substring of 'message' containing the first 5 characters and print it
        // Hint: Use .substring(startIndex, endIndex)
        System.out.printf("Substring message: %s\n", message.substring(0, 5));

        // TODO: 4 - Check if 'message' contains the word "Amigoscode" and print the result
        // Hint: Use .contains()
        System.out.printf("Does message contain Amigoscode? %s!\n", message.contains("Amigoscode") ? "Yes" : "No");

        // TODO: 5 - Replace "Amigoscode" with "Java" in 'message' and print the new string
        // Hint: Use .replace(oldValue, newValue)
        System.out.println(message.replace("Amigoscode", "Java"));


        // TODO: 6 - Trim the whitespace from the 'padded' string and print the result
        // Hint: Use .trim()
        System.out.println(padded.trim());

        // TODO: 7 - Split the 'csv' string by commas into a String array and print each element
        // Hint: Use .split(",") then loop through the resulting array
        String[] segments = csv.split(",");
        for (String segment : segments) {
            System.out.println(segment);
        }

        // TODO: 8 - Check if two strings are equal using .equals() (not ==)
        // Create two String variables with the same text content and compare them.
        // Print the result of .equals() and explain why == may not work for Strings.
        String txtOne = "Test";
        String txtTwo = "Test";
        System.out.println(txtOne.equals(txtTwo));
        // == may not work because String is a reference type and we may end up comparing references instead of values
    }
}
