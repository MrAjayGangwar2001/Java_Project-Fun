import java.util.Scanner;

// This is Library . In this Library we have books and we can add, delete, search and display books

public class Library extends Books {
    Scanner sc = new Scanner(System.in);
    private Books[] books;
    private User[] users;
    private int bookCount;

    public Library() {
        super(0, "", "");
        this.books = new Books[100];
        this.users = new User[100];
        this.bookCount = 0;

    }

    public void AddBook(int Book_Id, String title, String author) {
        if (bookCount < books.length) {
            books[bookCount] = new Books(Book_Id, title, author);
            bookCount++;
            setBook_Id(Book_Id);
            setTitle(title);
            setAuthor(author);
            setIssued(false);
            displayBookInfo();
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Book list is full. Cannot add more books.");
        }

    }

    public void SearchBook(String titleOrAuthor) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(titleOrAuthor)
                    || books[i].getAuthor().equalsIgnoreCase(titleOrAuthor)) {
                books[i].displayBookInfo();
                System.out.println("The Book " + titleOrAuthor + " is Available in the Library");
                return;
            }
        }
        System.out.println("The book is Not Available in the Library");
    }

    public void IssueBook(int bookId, int userId) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBook_Id() == bookId && !books[i].isIssued()) {
                books[i].setIssued(true);
                System.out.println("Book issued successfully to User ID: " + userId);
                return;
            }

        }
        System.out.println("Book not available or already issued.");
    }

    public void ReturnBook(int bookId) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBook_Id() == bookId && books[i].isIssued()) {
                books[i].setIssued(false);
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Book not found or not issued.");
    }

    public void RegisterUser(String userName, int userId, String userType) {
        User newUser;
        if (userType.equalsIgnoreCase("Student")) {
            newUser = new Student(userName, userId);
        } else if (userType.equalsIgnoreCase("Librarian")) {
            newUser = new Librarian(userName, userId);
        } else {
            System.out.println("Invalid user type.");
            return;
        }

        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = newUser;
                System.out.println("User registered successfully.");
                return;
            }
        }
        System.out.println("User registration failed. User list is full.");
    }

    public void AllBooksDisplay() {
        if (bookCount == 0) {
            System.out.println("No books available in The Library.");
        } else {
            for (int i = 0; i < bookCount; i++) {
                books[i].displayBookInfo();
                System.out.println("---------------------");
            }

        }
    }

}