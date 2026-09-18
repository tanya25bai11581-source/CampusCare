import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentManager studentManager = new StudentManager();
        AppointmentManager appointmentManager = new AppointmentManager();
        HealthRecordManager healthManager = new HealthRecordManager();

        int choice;

        do {
            System.out.println("\n=================================");
            System.out.println("          CAMPUSCARE");
            System.out.println(" Student Health Management System");
            System.out.println("=================================");
            System.out.println("1. Student Management");
            System.out.println("2. Appointment Management");
            System.out.println("3. Health Records");
            System.out.println("4. Exit");
            System.out.println("=================================");
            System.out.print("Enter your choice: ");

            try {
                choice = scanner.nextInt();

                switch (choice) {

                    case 1:
                        int studentChoice;

                        do {
                            System.out.println("\n===== STUDENT MANAGEMENT =====");
                            System.out.println("1. Add Student");
                            System.out.println("2. View Students");
                            System.out.println("3. Back");
                            System.out.print("Enter choice: ");

                            studentChoice = scanner.nextInt();

                            switch (studentChoice) {
                                case 1:
                                    studentManager.addStudent(scanner);
                                    break;

                                case 2:
                                    studentManager.viewStudents();
                                    break;

                                case 3:
                                    break;

                                default:
                                    System.out.println("Invalid choice!");
                            }

                        } while (studentChoice != 3);
                        break;

                    case 2:
                        int appointmentChoice;

                        do {
                            System.out.println("\n===== APPOINTMENT MANAGEMENT =====");
                            System.out.println("1. Book Appointment");
                            System.out.println("2. View Appointments");
                            System.out.println("3. Back");
                            System.out.print("Enter choice: ");

                            appointmentChoice = scanner.nextInt();

                            switch (appointmentChoice) {
                                case 1:
                                    appointmentManager.bookAppointment(scanner);
                                    break;

                                case 2:
                                    appointmentManager.viewAppointments();
                                    break;

                                case 3:
                                    break;

                                default:
                                    System.out.println("Invalid choice!");
                            }

                        } while (appointmentChoice != 3);
                        break;

                    case 3:
                        int recordChoice;

                        do {
                            System.out.println("\n===== HEALTH RECORDS =====");
                            System.out.println("1. Add Health Record");
                            System.out.println("2. View Health Records");
                            System.out.println("3. Back");
                            System.out.print("Enter choice: ");

                            recordChoice = scanner.nextInt();

                            switch (recordChoice) {
                                case 1:
                                    healthManager.addRecord(scanner);
                                    break;

                                case 2:
                                    healthManager.viewRecords();
                                    break;

                                case 3:
                                    break;

                                default:
                                    System.out.println("Invalid choice!");
                            }

                        } while (recordChoice != 3);
                        break;

                    case 4:
                        System.out.println("\nStarting background reminder task...");

                        ReminderTask reminder = new ReminderTask();
                        reminder.start();

                        try {
                            reminder.join();
                        } catch (InterruptedException e) {
                            System.out.println("Main thread interrupted.");
                        }

                        System.out.println("\nThank you for using CampusCare!");
                        break;

                    default:
                        System.out.println("\nInvalid choice!");

                }

            } catch (Exception e) {

                System.out.println("\nInvalid input! Please enter a number.");

                scanner.nextLine();
                choice = 0;
            }

        } while (choice != 4);

        scanner.close();
    }
}