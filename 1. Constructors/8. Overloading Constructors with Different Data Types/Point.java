/*Write a Java program to create a class called Point with instance variables x and y. Implement overloaded constructors:

a)One constructor takes int parameters.
b)Another constructor takes double parameters.
c)Print the values of the variables for each constructor.*/

public class Point {
    int x;
    int y;
    double dx;
    double dy;

    // Constructor for int parameters
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Constructor for double parameters
    public Point(double dx, double dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public void getPoint() {
        if (dx == 0 && dy == 0) { // Means int constructor was used
            System.out.println("x: " + x + ", y: " + y);
        } else { // Means double constructor was used
            System.out.println("x: " + dx + ", y: " + dy);
        }
    }

    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        p1.getPoint();

        Point p2 = new Point(7.7, 8.8);
        p2.getPoint();
    }
}

/*
OUTPUT:
x: 2, y: 3
x: 7.7, y: 8.8
*/