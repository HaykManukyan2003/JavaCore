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
                        if (!stack.isEmpty()) {
                            lastChar = stack.lastChar();
                            if (lastChar == '(') {
                                stack.pop();
                            } else {
                                System.err.println("error at index " + k + ": closing brace" + " ')'" + " is not matching the opening one " + "'" + lastChar + "'.");
                                return;
                            }
                        } else {
                            System.err.println("error at index " + k + ": Cannot compare the character " + "'" + c + "'" + " ... stack is empty.");
                            return;
                        }
                        break;

                    case '}':
                        if (!stack.isEmpty()) {
                            lastChar = stack.lastChar();
                            if (lastChar == '{') {
                                stack.pop();
                            } else {
                                System.err.println("error at index " + k + ": closing brace" + " '}'" + " is not matching the opening one " + "'" + lastChar + "'.");
                                return;
                            }
                        } else {
                            System.err.println("error at index " + k + ": Cannot compare the character " + "'" + c + "'" + " ... stack is empty.");
                            return;
                        }
                        break;

                    case ']':
                        if (!stack.isEmpty()) {
                            lastChar = stack.lastChar();
                            if (lastChar == '[') {
                                stack.pop();
                            } else {
                                System.err.println("error at index " + k + ": closing brace" + " ']'" + " is not matching the opening one " + "'" + lastChar + "'.");
                                return;
                            }
                        } else {
                            System.err.println("error at index " + k + ": Cannot compare the character " + "'" + c + "'" + " ... stack is empty.");
                            return;
                        }
                        break;
                }
            }
            if (!stack.isEmpty()) {
                System.err.println("opening brace " + "'" + stack.lastChar() + "'" + " does not have the closing one.");
            } else System.out.println("Brace Checker Validated successfully.");
        } else System.err.println("Need more than 1 character to check its validity.");
    }

}
