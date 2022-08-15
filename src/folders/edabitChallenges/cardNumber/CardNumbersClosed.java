package folders.edabitChallenges.cardNumber;

public class CardNumbersClosed {
    static char[] hideNumbers(String cardNumbers) {
        char[] array = new char[0];

        if (cardNumbers.length() == 16) {
            array = new char[cardNumbers.length()];
            char var;

            for (int k = 0; k < array.length; k++) {
                if (k > array.length - 5) {
                    array[k] = cardNumbers.charAt(k);
                } else {
                    var = '*';
                    array[k] = var;
                }
            }

        }
        return array;
    }

}
