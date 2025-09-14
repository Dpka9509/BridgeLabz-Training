// Base class: Course
class Course {
    String courseName;
    int duration; // in weeks

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

// Subclass: OnlineCourse
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass: PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // in percentage

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + (fee - (fee * discount / 100)));
        System.out.println("---------------------------");
    }
}

// Main class
public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        Course c1 = new Course("Introduction to Programming", 6);
        OnlineCourse c2 = new OnlineCourse("Java Fundamentals", 8, "Coursera", true);
        PaidOnlineCourse c3 = new PaidOnlineCourse("Full Stack Development", 12, "Udemy", true, 199.99, 20);

        c1.displayInfo();
        System.out.println("---------------------------");
        c2.displayInfo();
        System.out.println("---------------------------");
        c3.displayInfo();
    }
}
