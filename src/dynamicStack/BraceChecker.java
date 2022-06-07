package dynamicStack;

public class BraceChecker {

    DynamicStack stack = new DynamicStack();
    private final String text;

    private int openBraceIndex;

    BraceChecker(String text) {
        this.text = text;
    }

    void check() {

        char lastChar;

        if (text.length() > 1) {

            for (int k = 0; k < text.length(); k++) {
                char c = text.charAt(k);

                switch (c) {

                    case '(':
                    case '{':
                    case '[':
                        stack.push(c);
                        openBraceIndex = k;
                        break;

                    case ')':
                        if (stack.isNotEmpty()) {
                            lastChar = stack.lastChar();
                            if (lastChar == '(') {
                                stack.pop();
                            } else {
                                closingBraceError(k, lastChar, c);
                                return;
                            }
                        } else {
                            cannotCompareError(k, c);
                            return;
                        }
                        break;

                    case '}':
                        if (stack.isNotEmpty()) {
                            lastChar = stack.lastChar();
                            if (lastChar == '{') {
                                stack.pop();
                            } else {
                                closingBraceError(k, lastChar, c);
                                return;
                            }
                        } else {
                            cannotCompareError(k, c);
                            return;
                        }
                        break;

                    case ']':
                        if (stack.isNotEmpty()) {
                            lastChar = stack.lastChar();
                            if (lastChar == '[') {
                                stack.pop();
                            } else {
                                closingBraceError(k, lastChar, c);
                                return;
                            }
                        } else {
                            cannotCompareError(k, c);
                            return;
                        }
                        break;
                }
            }
            if (stack.isNotEmpty()) {
                openingBraceError();
            } else validatedSuccessfully();
        } else textLengthError();
    }

    private void closingBraceError(int index, char lastChar, char currentChar) {
        System.err.printf("error at index %d: closing brace '%c' is not matching the opening one '%c'.", index, currentChar, lastChar);
    }

    private void cannotCompareError(int index, char c) {
        System.err.printf("error at index %d: Cannot compare the character '%c' ... stack is empty.", index, c);
    }

    private void openingBraceError() {
        System.err.printf("error at index %d: opening brace '%c' does not have the closing one." ,openBraceIndex, stack.lastChar());
    }

    private void validatedSuccessfully() {
        System.out.println("Brace Checker Validated successfully.");
    }

    private void textLengthError() {
        System.err.println("Need more than 1 character to check its validity.");
    }

}
