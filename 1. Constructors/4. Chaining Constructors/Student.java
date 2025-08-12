//Write a Java program to create a class called Student with instance variables studentId, studentName, and grade. Implement a default constructor and a parameterized constructor that takes all three instance variables. Use constructor chaining to initialize the variables. Print the values of the variables.

public class Student
{
	String studentId, studentName, grade;

	public Student()
	{
		 this("000", "Unknown", "F"); // calling parameterized constructor
	}

	public Student(String studentId, String studentName, String grade)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
	}

	public void getStudent()
	{
		System.out.println("Student Id ="+studentId+" Student Name="+studentName+" Grade="+grade);
	}

	public static void main(String [] args)
	{
		Student s1 = new Student();
		s1.getStudent();

		Student s2 = new Student("S123" , "Kuheli Bera" , "G");
		s2.getStudent();
	}
}

/*
OUTPUT:
D:\Coding\Desktop\Java\OOP-Practice\1. Constructors\4. Chaining Constructors>java Student
Student Id =000 Student Name=Unknown Grade=F
Student Id =S123 Student Name=Kuheli Bera Grade=G
*/