package folders.classWork;

public class Book {

    private String title;
    private String description;
    private String authorName;
    private double price;
    private String currency;

    public Book(){} //default constructor;

    public Book(String title, String description, String authorName, double price, String currency) {
        this.title = title;
        this.description = description;
        this.authorName = authorName;
        this.price = price;
        this.currency = currency;
    }

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public String getAuthorName() {return authorName;}
    public void setAuthorName(String authorName) {this.authorName = authorName;}
    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}
    public String getCurrency() {return currency;}
    public void setCurrency(String currency) {this.currency = currency;}

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                ", currency='" + currency + '\'' +
                '}';
    }

}
