package chapter13.IOandTryWithResources.IoExample;

import java.io.*;

public class DataIOStream {

    private static final String FILE_PATH = "C:\\Users\\Nare\\IdeaProjects\\javaCore\\src\\chapter13\\IOandTryWithResources\\IoExample\\example33.txt";

    public static void main(String[] args) throws IOException {

        write();
        read();

    }

    private static void write() throws IOException {
        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(FILE_PATH));
        outputStream.writeInt(54);
        outputStream.writeBoolean(false);
        outputStream.close();
    }

    private static void read() throws IOException {
        DataInputStream inputStream = new DataInputStream(new FileInputStream(FILE_PATH));
        System.out.println(inputStream.readInt());
        System.out.println(inputStream.readBoolean());
        inputStream.close();
    }
}
