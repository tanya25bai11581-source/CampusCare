import java.util.ArrayList;
import java.util.Scanner;

public class HealthRecordManager {

    private ArrayList<HealthRecord> records = new ArrayList<>();

    public void addRecord(Scanner scanner) {

        scanner.nextLine();

        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Health Problem: ");
        String problem = scanner.nextLine();

        System.out.print("Enter Treatment/Advice: ");
        String treatment = scanner.nextLine();

        records.add(new HealthRecord(id, problem, treatment));

        System.out.println("\nHealth record added successfully!");
    }

    public void viewRecords() {

        if (records.isEmpty()) {
            System.out.println("\nNo health records found.");
            return;
        }

        System.out.println("\n===== HEALTH RECORDS =====");

        for (HealthRecord record : records) {
            record.displayRecord();
        }
    }
}