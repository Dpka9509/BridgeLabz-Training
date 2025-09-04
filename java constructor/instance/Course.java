// Course.java
class Course {
    // Instance variables
    String courseName;
    int duration;
    double fee;

    // Class variable
    static String instituteName = "ABC Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: " + fee + ", Institute: " + instituteName);
    }

    // Class method
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    // Main method
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 6, 15000);
        Course c2 = new Course("Python Programming", 4, 12000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("XYZ Academy");
        System.out.println("\nAfter updating institute name:");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
