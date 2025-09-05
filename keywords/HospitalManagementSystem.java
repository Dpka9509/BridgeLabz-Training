// HospitalManagementSystem.java
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Set hospital name
        Patient.setHospitalName("City Hospital");

        // Create patients
        Patient p1 = new Patient("Alice", 30, "Flu", 101);
        Patient p2 = new Patient("Bob", 45, "Fracture", 102);

        // Display details
        p1.displayPatientDetails();
        System.out.println();
        p2.displayPatientDetails();

        // Show total patients
        Patient.getTotalPatients();
    }
}
