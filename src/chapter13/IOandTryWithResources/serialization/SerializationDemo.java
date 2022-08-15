package chapter13.IOandTryWithResources.serialization;

import java.io.*;

public class SerializationDemo {

    private static final String FILE_PATH = "C:\\Users\\Nare\\IdeaProjects\\javaCore\\src\\chapter13\\IOandTryWithResources\\serialization\\example33.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student student = new Student("gg", "yo",  "Ggyo@gmail.com", 43);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
        oos.writeObject(student);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
        Object object = ois.readObject();
        Student students = (Student) object;
        System.out.println(students);
        oos.close();

    }
}
