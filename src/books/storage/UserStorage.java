package books.storage;

import books.model.User;

public class UserStorage {

    private User[] storage = new User[10];
    private int count = 0;

    public void push(User user) {
        if (count == storage.length - 1) {
            extend();
        }
        storage[count++] = user;
    }

    private void extend() {
        User[] reserveArray = new User[storage.length * 2];
        System.arraycopy(storage, 0, reserveArray, 0, count);
        storage = reserveArray;
    }

    public void displayUsers() {
        if (count == 0) {
            System.err.println("found 0 users in userStorage.");
        }
        for (int k = 0; k < count; k++) {
            System.out.println(k + ": " + storage[k]);
        }
    }

    public User getUserByEmail(String email) {
        for (int k = 0; k < count; k++) {
            if (storage[k].getEmail().equals(email)) {
                return storage[k];
            }
        }
        return null;
    }

    public int getCount() {
        return count;
    }

    private void matchCount(int matches) {
        if (matches > 1) System.out.println("found " + matches + " matches" + "\n");
        else if (matches == 1) System.out.println("found 1 match" + "\n");
        else System.err.println("no match found" + "\n");
    }
}
