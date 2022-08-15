package chapter14.collections.listInterface;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {

        String text = "madam";
        List<Character> list = new LinkedList<>();
        char[] chars = text.toCharArray();
        for (char c : chars) {
            list.add(c);
        }

        ListIterator<Character> listIterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());

        boolean isPalindrome = true;
        while (listIterator.hasNext() && reverseIterator.hasPrevious()) {
            if (listIterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("isPalindrome");
        } else System.out.println("is not palindrome");

    }
}
