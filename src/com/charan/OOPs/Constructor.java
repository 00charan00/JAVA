package com.charan.OOPs;

// Student class definition
class Student {
    // Instance variables
    String name;
    int age;
    int rollNumber;

    // Constructor to initialize Student object
    public Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Default constructor for manual initialization using a method
    public Student() {
        // No initialization here
    }

    // Method to set student details
    public void setDetails(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }

    // Main method to compare both approaches
    public static void main(String[] args) {
        // 1. Using the constructor to initialize the object
        System.out.println("Using Constructor:");
        Student student1 = new Student("John Doe", 20, 101); // Constructor initializes the object
        student1.displayDetails();  // Displaying details

        System.out.println("\nUsing Method with Parameters:");
        // 2. Using a method to set details after object creation
        Student student2 = new Student();  // Object created without initialization
        student2.setDetails("Jane Smith", 21, 102); // Method initializes the object
        student2.displayDetails();  // Displaying details
    }
}

