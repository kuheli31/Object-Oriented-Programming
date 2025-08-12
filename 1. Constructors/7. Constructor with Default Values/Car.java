//Write a Java program to create a class called Car with instance variables make, model, and year. Implement a parameterized constructor that initializes these variables and assigns default values if not provided. Print the values of the variables.

public class Car
{
    String make = "Toyota";
    String model = "G1";
    int year = 0000;

    public Car(String make, String model, int year)
    {
        // Assign default if make is null or empty
        if (make != null && !make.trim().isEmpty()) {
            this.make = make;
        }

        // Assign default if model is null or empty
        if (model != null && !model.trim().isEmpty()) {
            this.model = model;
        }

        // Assign default if year <= 0
        if (year > 0) {
            this.year = year;
        }
    }

    public void getCar()
    {
        System.out.println("Make = " + make + ", Model = " + model + ", Year = " + year);
    }

    public static void main(String[] args)
    {
        // All values provided
        Car c1 = new Car("Honda", "Civic", 2022);
        c1.getCar();

        // Missing make
        Car c2 = new Car("", "Accord", 2021);
        c2.getCar();

        // Missing model
        Car c3 = new Car("Ford", "", 2019);
        c3.getCar();

        // Invalid year
        Car c4 = new Car("BMW", "X5", -2020);
        c4.getCar();
    }
}

/*
OUTPUT:
Make = Honda, Model = Civic, Year = 2022
Make = Toyota, Model = Accord, Year = 2021
Make = Ford, Model = G1, Year = 2019
Make = BMW, Model = X5, Year = 0
*/