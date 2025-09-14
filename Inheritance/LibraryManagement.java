// Superclass: Book
class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author (extending Book)
class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
        System.out.println("---------------------------");
    }
}

// Main class
public class LibraryManagement {
    public static void main(String[] args) {
        Author a1 = new Author(
            "Effective Java", 
            2018, 
            "Joshua Bloch", 
            "Joshua Bloch is a software engineer and author, known for his work at Sun Microsystems and Google."
        );

        a1.displayInfo();
    }
}
