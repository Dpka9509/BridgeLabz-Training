import java.util.ArrayList;

class Book{
    private String title;
    private String author;

    public Book(String title , String author){
        this.title=title;
        this.author=author;
    }
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    //print
    @Override
    public String toString(){
        return "Book: "+title+" | Author:" +author;
    }
}

class Library{
    private String name;
    private ArrayList<Book>books;

    public Library(String name){
        this.name=name;
        this.books=new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }

     public void showBooks() {
        System.out.println("Library: " + name);
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book b : books) {
                System.out.println(" - " + b);
            }
        }
        System.out.println();
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        // Create independent Book objects
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("The Hobbit", "J.R.R. Tolkien");

        // Create Libraries
        Library cityLibrary = new Library("City Library");
        Library collegeLibrary = new Library("College Library");

        // Add books to libraries (aggregation)
        cityLibrary.addBook(b1);
        cityLibrary.addBook(b2);

        collegeLibrary.addBook(b2); // Same book can exist in multiple libraries
        collegeLibrary.addBook(b3);

        // Display books
        cityLibrary.showBooks();
        collegeLibrary.showBooks();
    }
}