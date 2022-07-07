package books.storage;

import books.customException.AuthorNotFoundException;
import books.model.Author;

public class AuthorStorage {

    private Author[] storage = new Author[10];
    private int count = 0;

    public void push(Author author) {
        if (count == storage.length - 1) {
            extend();
        }
        storage[count++] = author;
    }

    public void displayAuthors() {
        if (count == 0) {
            System.err.println("found 0 authors in authorStorage.");
        }
        for (int k = 0; k < count; k++) {
            System.out.println(k + ": " + storage[k]);
        }
    }

    public Author getAuthorByIndex(int index) throws AuthorNotFoundException {
        if (index >= count || index < 0) {
            throw new AuthorNotFoundException("Cannot find the Author: unreachable index has been given.");
        }
        if (storage[index] == null) {
            throw new AuthorNotFoundException("Cannot find the Author: object of corresponding index is Null");
        }
        return storage[index];
    }

    public int getCount() {
        return count;
    }

    private void extend() {
        Author[] reserveArray = new Author[storage.length * 2];
        System.arraycopy(storage, 0, reserveArray, 0, count);
        storage = reserveArray;
    }

    private void matchCount(int matches) {
        if (matches > 1) System.out.println("found " + matches + " matches" + "\n");
        else if (matches == 1) System.out.println("found 1 match" + "\n");
        else System.err.println("no match found" + "\n");
    }
}
