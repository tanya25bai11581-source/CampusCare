import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentManager {

    private ArrayList<Appointment> appointments = new ArrayList<>();

    public void bookAppointment(Scanner scanner) {

        scanner.nextLine();

        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Doctor Name: ");
        String doctor = scanner.nextLine();

        System.out.print("Enter Date (DD-MM-YYYY): ");
        String date = scanner.nextLine();

        System.out.print("Enter Time: ");
        String time = scanner.nextLine();

        appointments.add(new Appointment(id, doctor, date, time));

        System.out.println("\nAppointment booked successfully!");
    }

    public void viewAppointments() {

        if (appointments.isEmpty()) {
            System.out.println("\nNo appointments found.");
            return;
        }

        System.out.println("\n===== APPOINTMENTS =====");

        for (Appointment appointment : appointments) {
            appointment.displayAppointment();
        }
    }
}