package Sorting_algorithms;
//Java Program to Demonstrate Working of 
//Comparator Interface

//Importing required classes 
import java.io.*;
import java.lang.*;
import java.util.*;

//Class 1
//A class to represent a Student
class Student {

	int rollno;
	String name, address;

	public Student(int rollno, String name, String address)
	{
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	public String toString()
	{
		return this.rollno + " " + this.name + " "
			+ this.address;
	}

	public static int compareroll(Student a, Student b)
	{

		return a.rollno - b.rollno;
	}
	public static int comparename(Student a, Student b)
	{

		return a.name.compareTo(b.name);
	}

	public static void main(String[] args)
	{

		// Creating an empty ArrayList of Student type
		ArrayList<Student> ar = new ArrayList<Student>();

		// Adding entries in above List
		// using add() method
		ar.add(new Student(111, "Mayank", "london"));
		ar.add(new Student(131, "Anshul", "nyc"));
		ar.add(new Student(121, "Solanki", "jaipur"));
		ar.add(new Student(101, "Aggarwal", "Hongkong"));

		// Display message on console for better readability
		System.out.println("Unsorted");

		// Iterating over entries to print them
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		// Sorting student entries by roll number
		Collections.sort(ar, );

		// Display message on console for better readability
		System.out.println("\nSorted by rollno");

		// Again iterating over entries to print them
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		// Sorting student entries by name
		Collections.sort(ar, new Sortbyname());

		// Display message on console for better readability
		System.out.println("\nSorted by name");

		// // Again iterating over entries to print them
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
	}