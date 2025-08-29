//Write a Java program to create a class called "Counter" with a static variable count. Implement a constructor that increments count every time an object is created. Print the value of count after creating several objects.

public class Counter {
    // static variable shared among all objects
    static int count = 0;

    // Constructor increments count when an object is created
    public Counter() {
        count++;
    }

    public static void main(String[] args) {
        // Creating objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();

        // Printing the count after creating objects
        System.out.println("Number of objects created: " + Counter.count);
    }
}

/*
OUTPUT:
Number of objects created: 4
*/