//Write a Java program to create a class called "Initializer" with a static block that initializes a static variable 'initialValue' to 1000. Print the value of 'initialValue' before and after creating an instance of "Initializer".

public class Initializer {
    // static variable
    static int initialValue;

    // static block to initialize the static variable
    static {
        initialValue = 1000;
        System.out.println("Static block executed. initialValue set to: " + initialValue);
    }

    // constructor (just to show object creation, not needed for static var)
    public Initializer() {
        System.out.println("Initializer object created.");
    }

    public static void main(String[] args) {
        // Print value before creating object
        System.out.println("Before creating object, initialValue = " + Initializer.initialValue);

        // Create object
        Initializer obj = new Initializer();

        // Print value after creating object
        System.out.println("After creating object, initialValue = " + Initializer.initialValue);
    }
}

/*
OUTPUT:
Static block executed. initialValue set to: 1000
Before creating object, initialValue = 1000
Initializer object created.
After creating object, initialValue = 1000
*/