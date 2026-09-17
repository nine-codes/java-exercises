package com.amigoscode._1_beginners._1_thebasics;

/**
 * Exercise: Type Casting
 *
 * Learn how to convert between different data types in Java.
 * Widening (implicit): smaller type -> larger type (e.g., int -> double)
 * Narrowing (explicit): larger type -> smaller type (e.g., double -> int)
 */
public class TypeCasting {

    public static void main(String[] args) {

        // TODO: 1 - Widen an int to a double (implicit casting)
        // Declare an int variable with any value, then assign it to a double variable.
        // Print both variables to see the result.
        int random = 5;
        double doubledRandom = random;
        // Here I used in addition to the int placeholder also one for the double values '%f'
        System.out.printf("The int one: %d, and the double one: %f\n", random, doubledRandom);


        // TODO: 2 - Narrow a double to an int (explicit casting)
        // Declare a double variable (e.g., 9.78), then cast it to an int.
        // Print both variables to see what happens to the decimal part.
        double invoice = 5.50;
        int narrowed = (int) invoice;
        System.out.printf("Invoice: %f, Narrowed: %d\n", invoice, narrowed);


        // TODO: 3 - Cast an int to a char to get the character it represents
        // Hint: int value 65 corresponds to 'A' in ASCII
        // Print the resulting char.
        int charCode = 65;
        char ascii = (char) charCode;
        // Here I used in addition to the string placeholder also one for the char values '%c'
        System.out.printf("Char Code: %d, ASCII: %c\n", charCode, ascii);


        // TODO: 4 - Cast a char to an int to get its ASCII value
        // Hint: char 'Z' has an ASCII value of 90
        // Print the resulting int.
        char z = 'Z';
        int zCode = z;
        System.out.printf("ASCII: %c, Char Code: %d\n", z, zCode);


        // TODO: 5 - Convert a String "42" to an int using Integer.parseInt()
        // Declare a String variable with the value "42", then parse it to an int.
        // Print the result.
        String numText = "42";
        int num = Integer.parseInt(numText);
        System.out.printf("numText: %s, num: %d\n", numText, num);


        // TODO: 6 - Convert an int 42 to a String using String.valueOf()
        // Declare an int variable with the value 42, then convert it to a String.
        // Print the result.
        int age = 42;
        String ageText = String.valueOf(age);
        System.out.printf("Age: %d, Age Text: %s\n", age, ageText);
    }
}
