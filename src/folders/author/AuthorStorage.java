package folders.author;

public class AuthorStorage {

    private Author[] authors = new Author[10];
    private int size = 0;

    public void add(Author author) {
        if (size == authors.length) extend();
        authors[size++] = author;
    }

    private void extend() {
        Author[] tmp = new Author[authors.length * 2];
        System.arraycopy(authors, 0, tmp, 0, authors.length);
        authors = tmp;
    }

    public void print() {
        for (int k = 0; k < size; k++) {
            System.out.println(authors[k]);
        }
    }

    public void searchByName(String findName) {
        for (int k = 0; k < size; k++) {
            if (authors[k].getName().contains(findName)) {
                System.out.println(authors[k]);
            }
        }
    }

}
