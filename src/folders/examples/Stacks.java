package folders.examples;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {

        /*
        Stack<String> games = new Stack<String>();

        games.add("Call of Duty");
        games.add("Guitar hero");
        games.add("Super Monkey Ball");

        System.out.println(games.pop());
        System.out.println(games.peek());

        System.out.println(games);
        */

        //A
        //B
        //C

        Stack<Character> letters = new Stack<Character>();

        letters.add('C');
        letters.add('B');
        letters.add('A');

        System.out.println(letters);

        System.out.println(letters.empty());
        System.out.println(letters.contains('B'));

        System.out.println(letters.peek());

        System.out.println(letters.pop());

        System.out.println(letters);

        System.out.println(letters.get(1));

        System.out.println(letters);

        System.out.println(letters.set(1, 'G'));

        System.out.println(letters);

        System.out.println(letters.size());

        System.out.println(letters.push('h'));
        System.out.println(letters.push('q'));

        System.out.println(letters);

        System.out.println(letters.search('G'));

    }
}
