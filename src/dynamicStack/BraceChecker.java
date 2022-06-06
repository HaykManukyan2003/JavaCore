package dynamicStack;

public class BraceChecker {

    DynamicStack stack = new DynamicStack();
    private final String text;

    private void closingBraceError(int index, char lastChar) {
        System.err.println("error at index " + index + ": closing brace" + " ')'" + " is not matching the opening one " + "'" + lastChar + "'.");
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
                        if (!stack.isEmpty()) {
                            lastChar = stack.lastChar();
                            if (lastChar == '(') {
                                stack.pop();
                            } else {
                                closingBraceError(k, lastChar);
                                return;
                            }
                        } else {
                            cannotCompareError(k, c);
                            return;
                        }
                        break;

                    case '}':
                        if (!stack.isEmpty()) {
                            lastChar = stack.lastChar();
                            if (lastChar == '{') {
                                stack.pop();
                            } else {
                                closingBraceError(k, lastChar);
                                return;
                            }
                        } else {
                            cannotCompareError(k, c);
                            return;
                        }
                        break;

                    case ']':
                        if (!stack.isEmpty()) {
                            lastChar = stack.lastChar();
                            if (lastChar == '[') {
                                stack.pop();
                            } else {
                                closingBraceError(k, lastChar);
                                return;
                            }
                        } else {
                            cannotCompareError(k, c);
                            return;
                        }
                        break;
                }
            }
            if (!stack.isEmpty()) {
                openingBraceError();
            } else validatedSuccessfully();
        } else textLengthError();
    }

}
