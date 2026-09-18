public class ReminderTask extends Thread {

    @Override
    public void run() {

        System.out.println("\n[Background Task] Checking appointment reminders...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Reminder task interrupted.");
        }

        System.out.println("[Background Task] Reminder check completed.");
    }
}