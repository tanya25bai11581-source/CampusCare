public class Appointment {

    private String studentId;
    private String doctor;
    private String date;
    private String time;

    public Appointment(String studentId, String doctor, String date, String time) {
        this.studentId = studentId;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
    }

    public void displayAppointment() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Doctor: " + doctor);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("-------------------------");
    }
}