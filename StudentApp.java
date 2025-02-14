
// StudentRecord class to store and display student details
public class StudentRecord {
    // Fields to store student details
    private int studentID;
    private String name;
    private String course;

    // Constructor to initialize the fields
    public StudentRecord(int studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    // Method to display the student details
    public void displayInfo() {
        System.out.println("Student Details:");
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}
2. StudentApp.java (Class to interact with the user and create an object)
java
Copy
import java.util.Scanner;

// StudentApp class to interact with the user
public class StudentApp {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the student details
        System.out.print("Enter your student ID: ");
        int studentID = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character after reading an integer

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your course: ");
        String course = scanner.nextLine();

        // Instantiate a StudentRecord object with the user-provided data
        StudentRecord student = new StudentRecord(studentID, name, course);

        // Call the displayInfo method to display the student's details
        student.displayInfo();

        // Close the scanner
        scanner.close();
    }
}