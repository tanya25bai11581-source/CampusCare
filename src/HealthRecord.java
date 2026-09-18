public class HealthRecord {

    private String studentId;
    private String problem;
    private String treatment;

    public HealthRecord(String studentId, String problem, String treatment) {
        this.studentId = studentId;
        this.problem = problem;
        this.treatment = treatment;
    }

    public void displayRecord() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Problem: " + problem);
        System.out.println("Treatment: " + treatment);
        System.out.println("-------------------------");
    }
}