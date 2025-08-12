//Write a Java program to create a class called Singleton that ensures only one instance of the class can be created. Implement a private constructor and a public static method to get the single instance of the class. Print a message indicating the creation of the instance.

public class Singleton {
    int roll;
    private static Singleton instance; // Holds the single instance

    // Private constructor to prevent external instantiation
    private Singleton() {
        this.roll = 0;
        System.out.println("Singleton instance created");
    }

    // Public static method to get the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance(); // Creates instance
        Singleton s2 = Singleton.getInstance(); // Returns existing instance

        System.out.println(s1 == s2); // true — both references point to same object
    }
}

/*
Singleton instance created
true
*/