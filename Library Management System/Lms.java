
import java.util.Scanner;

public class Lms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        String response = "yes";
        do {
            System.out.println("Please Choose the option Below to Procced : ");

            System.out.println("Enter 1 : To see the book List :");
            System.out.println("Enter 2 : To Add New Book in the Library :");
            System.out.println("Enter 3 : To Search Any Book from Library by Title or Author :");
            System.out.println("Enter 4 : To Issue Book to the Student :");
            System.out.println("Enter 5 : To Return/Submit Book from User :");
            System.out.println("Enter 6 : To Register in the Library :");

            int input = sc.nextInt();
            sc.nextLine(); // Consume the newline character left by nextInt()

            switch (input) {
                case 1: {
                   // System.out.println("All Books are Available Here");
                    // for (int i = 0; i < lib.getBookCount(); i++) {
                    // lib.getBooks()[i].displayBookInfo();
                    // }
                    lib.AllBooksDisplay();
                    break;
                }
                case 2: {
                    System.out.println("You can add books Here");
                    System.out.print("Enter New Book ID: ");
                    int Book_Id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Book Title: ");
                    String title = sc.nextLine();
                    // sc.nextInt();
                    System.out.print("Enter New Book Author: ");
                    String author = sc.nextLine();

                    lib.AddBook(Book_Id, title, author);
                    break;
                }
                case 3: {
                    System.out.println("Please Enter Book Title or Author to Search: ");
                    String titleOrAuthor = sc.nextLine();
                    lib.SearchBook(titleOrAuthor);
                    break;
                }
                case 4: {
                    System.out.println("Please Enter Book ID to Issue: ");
                    int bookId = sc.nextInt();
                    System.out.println("Please Enter User ID to Issue Book: ");
                    int userId = sc.nextInt();
                    lib.IssueBook(bookId, userId);
                    break;
                }
                case 5: {
                    System.out.println("Please Enter Book ID to Return: ");
                    int bookId = sc.nextInt();
                    lib.ReturnBook(bookId);
                    break;
                }
                case 6: {
                    System.out.println("Please Enter Your Name: ");
                    String userName = sc.nextLine();
                    System.out.println("Please Enter Your ID: ");
                    int userId = sc.nextInt();
                    System.out.println("Please Enter UserType  Student / Librarian");
                    sc.next();
                    String userType = sc.nextLine();
                    lib.RegisterUser(userName, userId, userType);
                    break;
                }
                default: {
                    System.out.println("Invalid Input");
                    break;
                }
            }

            System.out.println("Do you want to book/process another booking? (yes/no): ");
            // sc.nextLine();
            response = sc.nextLine();
        } while (response.equalsIgnoreCase("yes"));
        System.out.println("Thank you for using the Library Management System ! ");
        sc.close();

    }
}
