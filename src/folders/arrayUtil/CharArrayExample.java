package folders.arrayUtil;

public class CharArrayExample {

    public static void main(String[] args) {

        //display char c's count if there are any in charArray;
        char[] charArray = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        char c = 'o';
        int cCount = 0;

        for (int k = 0; k < charArray.length; k++) {
            if (charArray[k] == c) cCount++;
        }
        System.out.println("char c count: " + cCount);

        //print two middle elements in array;
        char[] charArray2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        System.out.println(charArray2[(charArray2.length / 2) - 1] + ", " + charArray2[(charArray2.length / 2)]);

        //display true if array ends with ly, otherwise print false;
        char[] charArray3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };
        if (charArray3[charArray3.length - 2] == 'l' && charArray3[charArray3.length - 1] == 'y') {
            System.out.println(true);
        } else System.out.println(false);

        //print true if there is "b <something> b" in array;
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        char b = 'b';
        boolean flag = false;
        for (int k = 0; k < bobArray.length; k++) {
            if (bobArray[k] == b && bobArray[k + 2] == b) {
                flag = true;
                break;
            } else flag = false;
        }
        System.out.println(flag);

        //if not an empty char, then print;
        char[] text = {' ', ' ', 'b', 'a', 'r', ' ', 'e', 'v', ' ', ' '};
        for (int k = 0; k < text.length; k++) {
            if (text[k] != ' ') {
                System.out.print(text[k]);
            }
        }
        System.out.println();

    }
}
