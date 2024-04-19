package Prototype;

public class Book implements Cloneable {
    private String author;
    private String title;
    private String genre;
    private int publicationYear;

    public Book(String author, String title, String genre, int publicationYear) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    public Book clone() {
        return new Book(this.author, this.title, this.genre, this.publicationYear);
    }

public String getTitle() {
    return this.title;
}

public String getAuthor() {
    return this.author;
}
    // getters and setters omitted for brevity
}