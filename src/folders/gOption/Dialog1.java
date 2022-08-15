package folders.gOption;

import javax.swing.*;

public class Dialog1 {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What is your name?");
        String message = String.format("Welcome %s, to Java programming.", name);
        JOptionPane.showMessageDialog(null, message);

//        Modify the addition program to use dialog-based input and output with the
//        methods of class JOptionPane. Since method showInputDialog returns a String,
//        you must convert the String the user enters to an int for use in calculations.
//        The static method parseInt of class Integer (package java.lang) takes a String argument
//        representing an integer and returns the value as an int.
//        If the String does not contain a valid integer, the program will terminate with an error.

    }
}
