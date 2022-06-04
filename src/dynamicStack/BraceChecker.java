package dynamicStack;

public class BraceChecker {

    private final String text;

    BraceChecker(String text) {
        this.text = text;
    }

    void check() {
        DynamicStack stack = new DynamicStack();

        char lastChar;

        if (text.length() > 1) {
            labelFor:
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
                                System.err.println("error at index " + k + ": closing brace" + " ')'" +  " is not matching the opening one " + "'" + lastChar + "'");
                                break labelFor;
                            }
                        } else {
                            System.err.println("Cannot compare the last character...stack is empty");
                            break labelFor;
                        }
                        break;

                    case '}':
                        if (!stack.isEmpty()) {
                            lastChar = stack.lastChar();
                            if (lastChar == '{') {
                                stack.pop();
                            } else {
                                System.err.println("error at index " + k + ": closing brace" + " '}'" +  " is not matching the opening one " + "'" + lastChar + "'");
                                break labelFor;
                            }
                        } else {
                            System.err.println("Cannot compare the last character...stack is empty");
                            break labelFor;
                        }
                        break;

                    case ']':
                        if (!stack.isEmpty()) {
                            lastChar = stack.lastChar();
                            if (lastChar == '[') {
                                stack.pop();
                            } else {
                                System.err.println("error at index " + k + ": closing brace" + " ']'" +  " is not matching the opening one " + "'" + lastChar + "'");
                                break labelFor;
                            }
                        } else {
                            System.err.println("Cannot compare the last character...stack is empty");
                            break labelFor;
                        }
                        break;
                }
            }
        } else System.err.println("Need more than 1 character to check its validity");
    }

}
