package books.storages;

import books.exceptions.AuthorNotFoundException;
import books.objects.Author;

public class AuthorStorage {

    private Author[] storage = new Author[10];
    private int count = 0;

    public void push(Author author) {
        if (count == storage.length - 1) {
            extend();
        }
        storage[count++] = author;
    }

    private void extend() {
        Author[] reserveArray = new Author[storage.length * 2];
        System.arraycopy(storage, 0, reserveArray, 0, count);
        storage = reserveArray;
    }

    public void displayAuthors() {
        for (int k = 0; k < count; k++) {
            System.out.println(k + ": " + storage[k]);
        }
    }

    public void getAuthorByIndex(int index) {
        if (index < 0) {
            System.err.println("failed to search: index cannot be negative");
        } else if (index >= count) {
            throw new AuthorNotFoundException("Cannot find the Author: unreachable index has been given.");
        } else if (storage[index] == null) {
            throw new AuthorNotFoundException("Cannot find the Author: value of corresponding index is Null");
        } else System.out.println(storage[index]);
    }

    public void displayAuthorsByGender(String gender) {
        int matches = 0;
        for (int k = 0; k < count; k++) {
            if (storage[k].getGender().equalsIgnoreCase(gender)) {
                System.out.println(storage[k]);
                matches++;
            }
        }
        matchCount(matches);
    }

    public int getCount() {
        System.out.print("author count: ");
        return count;
    }

    private void matchCount(int matches) {
        if (matches > 1) System.out.println("found " + matches + " matches" + "\n");
        else if (matches == 1) System.out.println("found 1 match" + "\n");
        else System.err.println("no match found" + "\n");
    }

}
