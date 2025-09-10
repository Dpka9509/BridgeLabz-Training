import java.util.ArrayList;
import java.util.List;

// Patient class
class Patient {
    private String name;
    private List<Doctor> doctors; // Association with multiple doctors

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Add doctor to patient’s list
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    // View all doctors this patient consulted
    public void viewDoctors() {
        System.out.println("Patient: " + name + " has consulted with:");
        if (doctors.isEmpty()) {
            System.out.println("  No doctors yet.");
        } else {
            for (Doctor d : doctors) {
                System.out.println("  - " + d.getName());
            }
        }
    }
}

// Doctor class
class Doctor {
    private String name;
    private String specialization;
    private List<Patient> patients; // Association with multiple patients

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Communication: doctor consults patient
    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " (" + specialization + ") is consulting patient " + patient.getName());

        // Build association both ways
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
        patient.addDoctor(this);
    }

    // View all patients this doctor consulted
    public void viewPatients() {
        System.out.println("Dr. " + name + " has consulted:");
        if (patients.isEmpty()) {
            System.out.println("  No patients yet.");
        } else {
            for (Patient p : patients) {
                System.out.println("  - " + p.getName());
            }
        }
    }
}

// Hospital class (container for doctors and patients)
class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showHospitalDetails() {
        System.out.println("Hospital: " + name);

        System.out.println(" Doctors:");
        for (Doctor d : doctors) {
            System.out.println("  - " + d.getName() + " (" + d.specialization + ")");
        }

        System.out.println(" Patients:");
        for (Patient p : patients) {
            System.out.println("  - " + p.getName());
        }
        System.out.println();
    }
}

// Main class
public class HospitalExample {
    public static void main(String[] args) {
        // Create hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor d1 = new Doctor("Smith", "Cardiologist");
        Doctor d2 = new Doctor("Adams", "Neurologist");

        // Create patients
        Patient p1 = new Patient("John");
        Patient p2 = new Patient("Emily");

        // Add doctors and patients to hospital
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        // Show hospital details
        hospital.showHospitalDetails();

        // Consultations (communication + association)
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        System.out.println();

        // View associations
        d1.viewPatients();
        d2.viewPatients();
        p1.viewDoctors();
        p2.viewDoctors();
    }
}

