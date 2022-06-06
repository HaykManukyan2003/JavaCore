package dynamicStack;

public class BraceChecker {

    DynamicStack stack = new DynamicStack();
    private final String text;

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
        System.err.println("error at index " + index + ": closing brace " + "'" + currentChar + "'" + " is not matching the opening one " + "'" + lastChar + "'.");
    }

    private void cannotCompareError(int index, char c) {
        System.err.println("error at index " + index + ": Cannot compare the character " + "'" + c + "'" + " ... stack is empty.");
    }

    private void openingBraceError() {
        System.err.println("opening brace " + "'" + stack.lastChar() + "'" + " does not have the closing one.");
    }

    private void validatedSuccessfully() {
        System.out.println("Brace Checker Validated successfully.");
    }

    private void textLengthError() {
        System.err.println("Need more than 1 character to check its validity.");
    }

}
