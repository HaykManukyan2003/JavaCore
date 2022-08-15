package chapter7.stringBuilderAndBuffer;

public class StringBuilderExample {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int k = 0; k < 4; k++) {
            stringBuilder.append("ggYo ");
            stringBuilder.append("nakamura ");
        }
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer(); // much usable in multithreaded programming;
        stringBuffer.append(3);
        System.out.println(stringBuffer);
    }
}