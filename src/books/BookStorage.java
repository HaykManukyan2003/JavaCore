package books;

public class BookStorage {

    private Book[] storage = new Book[10];
    private int count = 0;

    public void push(Book book) {
        if (count == storage.length - 1) {
            extend();
        }
        storage[count++] = book;
    }

    private void extend() {
        Book[] reserveArray = new Book[storage.length * 2];
        System.arraycopy(storage, 0, reserveArray, 0, count);
        storage = reserveArray;
    }

    public void displayAllBooks() {
        for (int k = 0; k < count; k++) {
            System.out.println(k + ": " + storage[k]);
        }
    }

    public void displayBooksByAuthorName(String authorName) {
        int matches = 0;
        for (int k = 0; k < count; k++) {
            if (storage[k].getAuthorName().equalsIgnoreCase(authorName)) {
                System.out.println(storage[k]);
                matches++;
            }
        }
        matchCount(matches);
    }

    public void displayBooksByGenre(String genre) {
        int matches = 0;
        for (int k = 0; k < count; k++) {
            if (storage[k].getGenre().equalsIgnoreCase(genre)) {
                System.out.println(storage[k]);
                matches++;
            }
        }
        matchCount(matches);

    }

    public void priceRangeSearch(double minimumRange, double maximumRange) {
        int matches = 0;
        if (minimumRange < maximumRange && minimumRange >= 0.0 && maximumRange >= 0.1) {
            for (int k = 0; k < count; k++) {
                if (storage[k].getPrice() >= minimumRange && storage[k].getPrice() <= maximumRange) {
                    System.out.println(storage[k]);
                    matches++;
                }
            }
            matchCount(matches);
        } else System.err.println("wrong argument input");
    }

    public int getCount() {
        System.out.print("book count: ");
        return count;
    }

    private void matchCount(int matches) {
        if (matches > 1) System.out.println("found " + matches + " matches" + "\n");
        else if (matches == 1) System.out.println("found 1 match" + "\n");
        else System.out.println("no match found" + "\n");
    }

}
