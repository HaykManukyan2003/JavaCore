package folders.examples;

public class CheckPalindrome {

    public static boolean checkPalindrome(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(checkPalindrome("gag"));

    }
}
