package folders.examples;

import javax.swing.*;

public class JOptionPaneExample {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        String message = String.format("Welcome, %s, to Java Programming", name);
        JOptionPane.showMessageDialog(null, message);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "you are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in meters"));
        JOptionPane.showMessageDialog(null, "your height is " + height + " meters");
    }
}
