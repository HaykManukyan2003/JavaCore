package student;

import java.util.Scanner;

public class StudentDemo {

    private static final Scanner scanner = new Scanner(System.in);
    private static final StudentDataBase storage = new StudentDataBase();

    public static void main(String[] args) {

        boolean isRunning = true;
        int command;

        while (isRunning) {
            System.out.println("Input 0 to exit the program.");
            System.out.println("Input 1 to add a student.");
            System.out.println("Input 2 to display all students.");
            System.out.println("Input 3 to display student count.");
            System.out.println("Input 4 to delete student by index.");
            System.out.println("Input 5 to display student by lesson.");
            System.out.println("Input 6 to change student's lesson.");
            System.out.print("\n");

            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

            switch (command) {
                case 0:
                    isRunning = false;
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    storage.display();
                    System.out.print("\n");
                    break;
                case 3:
                    System.out.println(storage.getSize());
                    System.out.print("\n");
                    break;
                case 4:
                    storage.display();
                    System.out.println("choose index to delete the corresponding student object");
                    int index = Integer.parseInt(scanner.nextLine());
                    storage.deleteByIndex(index);
                    break;
                case 5:
                    System.out.println("Input lesson name");
                    String lessonName = scanner.nextLine();
                    storage.displayStudentByLesson(lessonName);
                    System.out.print("\n");
                    break;
                case 6:
                    storage.display();
                    System.out.println("choose index to change the corresponding student's lesson");
                    int indexToChange = Integer.parseInt(scanner.nextLine());
                    System.out.println("change the lesson");
                    String changedLesson = scanner.nextLine();
                    storage.changeLessonByIndex(indexToChange, changedLesson);
                    break;
                default:
                    System.err.println("invalid command ... try again.");
            }

        }
    }

    private static void addStudent() {
        System.out.println("Input student's name:");
        String name = scanner.nextLine();

        System.out.println("Input student's surname:");
        String surname = scanner.nextLine();

        System.out.println("Input student's age:");
        int age;
        try {
            age = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("wrong input for age");
            age = 0;
        }

        System.out.println("Input student's phoneNumber:");
        int phoneNumber;

        try {
            phoneNumber = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("wrong input for phoneNumber");
            phoneNumber = 0;
        }

        System.out.println("Input student's city:");
        String city = scanner.nextLine();

        System.out.println("Input student's lesson:");
        String lesson = scanner.nextLine();

        Student student = new Student(name, surname, age, phoneNumber, city, lesson);
        storage.push(student);
        System.out.println("Student object successfully pushed onto storage." + "\n");
    }

}
