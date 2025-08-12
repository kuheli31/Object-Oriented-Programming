//Write a Java program to create a class called Classroom with instance variables className and students (an array of strings). Implement a parameterized constructor that initializes these variables. Print the values of the variables.

public class Classroom {
    String className;
    String[] students;

    // Parameterized constructor
    public Classroom(String className, String[] students) {
        this.className = className;
        this.students = students;
    }

    // Method to print values
    public void display() {
        System.out.println("Class Name: " + className);
        System.out.print("Students: ");
        for (String student : students) {
            System.out.print(student + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] studentList = {"Alice", "Bob", "Charlie"};
        Classroom c1 = new Classroom("Java Programming", studentList);
        c1.display();
    }
}

/*
Class Name: Java Programming
Students: Alice Bob Charlie
*/