package books.model;

public class Book {

    private String title;
    private Author author;
    private String genre;
    private double price;
    private User registeredUser;

    public Book() {}

    public Book(String title, Author author, String genre, double price, User registeredUser) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.registeredUser = registeredUser;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0.0) {
            System.err.println("price can't be less than 0.0");
        } else this.price = price;
    }

    public User getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(User registeredUser) {
        this.registeredUser = registeredUser;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\''
                + ", " + author + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                ", registeredUser=" + registeredUser +
                '}';
    }
}
