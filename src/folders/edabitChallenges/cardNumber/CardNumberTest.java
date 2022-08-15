package folders.edabitChallenges.cardNumber;

import static folders.edabitChallenges.cardNumber.CardNumbersClosed.hideNumbers;

public class CardNumberTest {
    public static void main(String[] args) {

        char[]array2;

        array2 = hideNumbers("1234567812343333");

        for (char c : array2) {
            System.out.print(c);
        }
    }
}
