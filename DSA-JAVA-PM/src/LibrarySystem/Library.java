package LibrarySystem;
import java.util.Objects;
import java.util.UUID;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public Library(){

    }

    public void addBook(){
        System.out.println("Enter title: ");
        String title = input.nextLine();
        System.out.println("Enter author: ");
        String author = input.nextLine();
        System.out.println("Enter details: ");
        String details = input.nextLine();
        String bookId = UUID.randomUUID().toString();

        Book myBook = new Book(author,title,details,bookId);
        for(Book book:books){
            if(book.equals(myBook)){
                System.out.println("this book is already in the database");
            }
        }
        if(!books.contains(myBook)){
            books.add(myBook);
        }
    }
    public void viewBook(){
        if(books.isEmpty()){
            System.out.println("The library is empty");
        }
        for(Book book:books){
            System.out.println(book.toString());
        }
    }
    public void searchBook(){
        System.out.println("Enter the title: ");
        String title = input.nextLine();
        int counter = 0;
        for(Book book:books){
            if(book.getTitle().equals(title)){
                counter++;
                System.out.println(book.toString());
            }
        }
        System.out.println("Number of found result: "+counter);

    }
    public void deleteBook(){
        System.out.println("Enter the title of the book: ");
        String title = input.nextLine();
        boolean checker = true;
        for(Book book:books){
            if(book.getTitle().equals(title)){
                books.remove(book);
                checker = false;
            }
        }
        if(!checker){
            System.out.println("book deleted successfully Title: "+title);
        }else{
            System.out.println("no book found int he database with that title");
        }
    }


}


class Book{
    private String author;
    private String title;
    private String details;
    private String bookId;

    public Book(String author, String title, String details, String bookId) {
        this.author = author;
        this.title = title;
        this.details = details;
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return
                "| author='" + author +
                "| title='" + title +
                "| details='" + details +
                "| bookId='" + bookId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(title, book.title) && Objects.equals(bookId, book.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, bookId);
    }
}
