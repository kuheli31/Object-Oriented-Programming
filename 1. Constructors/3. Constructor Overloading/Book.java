/*Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:

i)One constructor takes title and author as parameters.
ii)The other constructor takes title, author, and price as parameters.
iii)Print the values of the variables for each constructor.*/

public class Book
{
	String title , author;
	float price;

	public Book()
	{
		 this.title = "Unknown";
        	 this.author = "Unknown";
        	 this.price = 0.0f;
	}

	public Book(String title , String author)
	{
		this.title = title;
		this.author = author;
	}

	public Book(String title , String author , float price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void getBook()
	{
		System.out.println("Title= "+title+" Author= "+author+" Price= "+price);
	}

	public static void main(String[] args)
	{
		Book b1 = new Book();
		b1.getBook();
		Book b2 = new Book("Harry Potter" , "J.K.Rowling");
		b2.getBook();
		Book b3 = new Book("Harry Potter" , "J.K.Rowling" , 500.201f);
		b3.getBook();
	}

}

/*
OUTPUT:
D:\Coding\Desktop\Java\OOP-Practice\1. Constructors\3. Constructor Overloading>java Book
Title= Unknown Author= Unknown Price= 0.0
Title= Harry Potter Author= J.K.Rowling Price= 0.0
Title= Harry Potter Author= J.K.Rowling Price= 500.201
*/