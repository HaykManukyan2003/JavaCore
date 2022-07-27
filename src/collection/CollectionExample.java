package collection;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {

    }

    static List<String> arrayToList(String[] values) {
        return Arrays.asList(values);
    }

    static List<String> removeByIndex(List<String> list, int index) {
        list.remove(index);
        return list;
    }

    static Set<String> listToSet(List<String> list) {
        return new HashSet<>(list);
    }

    static LinkedList<Integer> listToLinkedList(List<Integer> list) {
        return new LinkedList<>(list);
    }

    static List<Integer> reverseNumbers(List<Integer> list) {
        Collections.reverse(list);
        return list;
    }

    static void printFirstFive(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext() && !(iterator.nextIndex() == 5)) {
            System.out.println(iterator.next());
        }
    }

    static int sizeOfList(List<String> list) {
        return list.size();
    }

}
