package chapter7.commandLineArguments;

public class CommandLine {

    public static void main(String[] args) {

        for (int k = 0; k < args.length; k++) {
            System.out.println("args[" + k + " ]: " + args[k]);
        }

    }
}
