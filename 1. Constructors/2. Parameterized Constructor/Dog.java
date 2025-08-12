//Write a Java program to create a class called Dog with instance variables name and color. Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables. Print the values of the variables.

public class Dog
{
	String name;
	String color;

	public Dog(String name , String color)
	{
		this.name = name;
		this.color = color;
	}

	public void getDog()
	{
		System.out.println("Name= "+name+" Color= "+color);
	}

	public static void main(String[] args)
	{
		Dog d = new Dog("Durjoy" , "Dark yellow");
		d.getDog();
	}
}

/*
OUTPUT:
D:\Coding\Desktop\Java\OOP-Practice\1. Constructors\2. Parameterized Constructor>java Dog
Name= Durjoy Color= Dark yellow
*/