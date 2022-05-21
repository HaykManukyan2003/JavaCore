package arrayUtil;

public class ArraySpaceExample {

    public static void main(String[] args) {

        char[] spaceArray = {' ', ' ', 'c', 'a', 't', ' ', ' ', 'b', 'i', ' ', ' ', 'b', ' ', ' ', ' '};
        char space = ' ';
        char[] resultChar = new char[0];

        for (int k = 0; k < spaceArray.length; k++) {
            if (spaceArray[k] != space) {
                for (int l = spaceArray.length - 1; l > k; l--) {
                    if (spaceArray[l] != space) {
                        resultChar = new char[l - k + 1];
                        int resultCharIndex = 0;
                        for ( ; k <= l; k++) {
                            resultChar[resultCharIndex] = spaceArray[k];
                            resultCharIndex++;
                        }
                    }
                }
            }
        }
        for (char c : resultChar) {
            System.out.print(c);
        }
    }
}
