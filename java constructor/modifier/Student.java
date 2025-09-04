// Student.java
class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    // Constructor
    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public methods to access private cgpa
    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0 && cgpa <= 10) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA value.");
        }
    }
}

// Subclass
class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    public void displayDetails() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", Specialization: " + specialization + ", CGPA: " + getCgpa());
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Alice", 8.5, "AI & ML");
        pg.displayDetails();
        pg.setCgpa(9.2);
        pg.displayDetails();
    }
}
