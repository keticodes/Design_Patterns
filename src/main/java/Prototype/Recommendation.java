package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Cloneable {
    private String targetAudience;
    private List<Book> books;

    public Recommendation(String targetAudience, List<Book> books) {
        this.targetAudience = targetAudience;
        this.books = books;
    }

    public Recommendation clone() {
        List<Book> clonedBooks = new ArrayList<>();
        for (Book book : this.books) {
            clonedBooks.add(book.clone());
        }
        return new Recommendation(this.targetAudience, clonedBooks);
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }
    public String getTargetAudience() {
    return this.targetAudience;
}
//getters
public List<Book> getBooks() {
    return this.books;
}

}