package com.amigoscode._2_developers._5_methods;

import java.util.Arrays;

/**
 * Variable Arguments (Varargs) Exercises
 *
 * Practice using the varargs syntax (Type... name) which allows methods to accept
 * zero or more arguments of the same type. Internally, varargs are treated as arrays.
 */
public class VarArgs {

    // TODO: 1 - Create a method: int sum(int... numbers)
    //  Returns the sum of all provided numbers.
    //  If no arguments are provided, return 0.
    //  Hint: use a for-each loop to iterate over 'numbers'.
    public static int sum(int... numbers) {
        int result = 0;
        for(int number : numbers) {
            result += number;
        }
        return result;
    }

    // TODO: 2 - Create a method: String concatenate(String... strings)
    //  Joins all strings with a single space between them.
    //  Example: concatenate("Hello", "World") returns "Hello World"
    //  If no arguments, return an empty string "".
    //  Hint: use StringBuilder or String.join(" ", strings).
    public static String concatenate(String... strings) {
        return String.join(" ", strings);
    }


    // TODO: 3 - Create a method: int findMax(int... numbers)
    //  Returns the largest value among the arguments.
    //  If no arguments are provided, throw an IllegalArgumentException
    //  with the message "At least one number required".
    public static int findMax(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number required");
        } else {
            int max = 0;
            for (int number : numbers) {
                if (number > max) {
                    max = number;
                }
            }

            return max;
        }
    }

    // TODO: 4 - Create a method: void printAll(Object... items)
    //  Prints each item on a separate line, prefixed with its index.
    //  Example output:
    //    [0] Hello
    //    [1] 42
    //    [2] true
    public static void printAll(Object... items) {
        for (Object item : items) {
            System.out.println(item);
        }
    }

    public static void format(String prefix, int... numbers) {
        System.out.printf("%s %s", prefix, Arrays.toString(numbers));
    }


    public static void main(String[] args) {
        VarArgs va = new VarArgs();

        System.out.println("=== Sum ===");
        // TODO: 5 - Demonstrate calling sum() with different numbers of arguments:
        //  - sum()           -> 0  (zero args)
        //  - sum(5)          -> 5  (one arg)
        //  - sum(1, 2, 3, 4) -> 10 (many args)
        //  Print each result.
        System.out.printf("Sum of 0 numbers: %d\n", sum());
        System.out.printf("Sum of one number passed in (5): %d\n", sum(5));
        System.out.printf("Sum of 1, 2, 3, 4: %d\n", sum(1, 2, 3, 4));


        System.out.println("\n=== Concatenate ===");
        // Print: concatenate("Java", "is", "awesome")
        System.out.println(concatenate("Java", "is", "awesome"));

        System.out.println("\n=== Find Max ===");
        // Print: findMax(3, 7, 2, 9, 1)
        System.out.println(findMax(3, 7, 2, 9, 1));

        System.out.println("\n=== Print All ===");
        // Call: printAll("Hello", 42, true, 3.14)
        printAll("Hello", 42, true, 3.14);

        System.out.println("\n=== Mixed Params ===");
        // TODO: 6 - Create a method: String format(String prefix, int... numbers)
        //  The first parameter is a regular String, followed by varargs.
        //  Returns the prefix followed by the numbers in brackets.
        //  Example: format("Values", 1, 2, 3) returns "Values: [1, 2, 3]"
        //  Hint: varargs must be the LAST parameter in the method signature.
        //  Then call the method and print the result here.
        format("Values", 1, 2, 3);
    }
}
