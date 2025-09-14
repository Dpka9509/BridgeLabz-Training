// Superclass
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass 1: Teacher
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        displayInfo();
        System.out.println("Role: Teacher, Subject: " + subject);
        System.out.println("----------------------");
    }
}

// Subclass 2: Student
class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        displayInfo();
        System.out.println("Role: Student, Grade: " + grade);
        System.out.println("----------------------");
    }
}

// Subclass 3: Staff
class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        displayInfo();
        System.out.println("Role: Staff, Department: " + department);
        System.out.println("----------------------");
    }
}

// Main class to test
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Alice", 35, "Math");
        Student s1 = new Student("Bob", 16, 10);
        Staff st1 = new Staff("Charlie", 40, "Administration");

        t1.displayRole();
        s1.displayRole();
        st1.displayRole();
    }
}
