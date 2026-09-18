import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Scanner scanner) {

        scanner.nextLine();

        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        Student student = new Student(id, name, age, department);
        students.add(student);

        System.out.println("\nStudent added successfully!");
    }

    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("\nNo students found.");
            return;
        }

        System.out.println("\n===== STUDENT LIST =====");

        for (Student student : students) {
            student.displayStudent();
        }
    }
}