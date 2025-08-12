// All Books are available Here


public class Books {

    private int Book_Id;
    private String title;
    private String author;
    boolean isIssued;

    public Books(int book_Id, String title, String author) {
        this.Book_Id = book_Id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public int getBook_Id() {
        return Book_Id;
    }
    public void setBook_Id(int book_Id) {
        this.Book_Id = book_Id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public boolean isIssued() {
        return isIssued;
    }
    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    public void displayBookInfo() {
        System.out.println("Book ID: " + Book_Id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Is Issued: " + (isIssued ? "Yes" : "No"));
    }

}
