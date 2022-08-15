package chapter13.IOandTryWithResources.IoExample;

import java.io.*;

public class FileReadAndWrite {

    private static final String FILE_PATH = "C:\\Users\\Nare\\IdeaProjects\\javaCore\\src\\chapter13\\IOandTryWithResources\\IoExample\\example33.txt";

    public static void main(String[] args) throws IOException {

        write();
        read();
    }

    private static void write() throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH))) {
            bufferedWriter.write("hello java \n");
            bufferedWriter.write("hello java, line 2");
        }
    }

    private static void read() throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH))) {
//            String line = "";
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }

            int character;
            int count = 0;
            while ((character = bufferedReader.read()) != -1) {
                if (character == 'l') {
                    count++;
                }
                System.out.println((char) character);
            }
            System.out.println("count " + count);

        }
    }
}
