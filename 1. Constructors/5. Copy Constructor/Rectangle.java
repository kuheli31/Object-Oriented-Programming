//Write a Java program to create a class called Rectangle with instance variables length and width. Implement a parameterized constructor and a copy constructor that initializes a new object using the values of an existing object. Print the values of the variables.

public class Rectangle
{
    double length, width;

    // Parameterized constructor
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    // Copy constructor
    public Rectangle(Rectangle r)
    {
        this.length = r.length;
        this.width = r.width;
    }

    public void getRectangle()
    {
        System.out.println("Length = " + length + " Width = " + width);
    }

    public static void main(String[] args)
    {
        Rectangle rect1 = new Rectangle(10.5, 5.5); // parameterized constructor
        rect1.getRectangle();

        Rectangle rect2 = new Rectangle(rect1); // copy constructor
        rect2.getRectangle();
    }
}

/*
OUTPUT:
Length = 10.5 Width = 5.5
Length = 10.5 Width = 5.5
*/