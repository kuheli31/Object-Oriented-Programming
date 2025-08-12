//Write a Java program to create a class called "Cat" with instance variables name and age. Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.

public class Cat
{
    String name;
    int age;

    public Cat() // default constructor
    {
        this.name = "Unknown";
        this.age = 0;
    }

    public void getCat()
    {
        System.out.println("Name= " + name + " Age= " + age);
    }
}