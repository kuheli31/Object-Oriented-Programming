//Write a Java program to create a class called "MathUtility" with a static method add that takes two integers and returns their sum. Demonstrate the usage of this static method in the main method without creating an instance of "MathUtility".

public class MathUtility {
    // Static method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Calling the static method without creating an object
        int result1 = MathUtility.add(10, 20);
        int result2 = MathUtility.add(5, 7);

        // Printing the results
        System.out.println("Sum of 10 and 20: " + result1);
        System.out.println("Sum of 5 and 7: " + result2);
    }
}

/*
OUTPUT:
Sum of 10 and 20: 30
Sum of 5 and 7: 12
*/