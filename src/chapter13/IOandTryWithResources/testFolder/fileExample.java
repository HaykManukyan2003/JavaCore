package chapter13.IOandTryWithResources.testFolder;

import java.io.File;
import java.io.IOException;

public class fileExample {

    static String filePath = "C:\\Users\\Nare\\IdeaProjects\\javaCore\\src\\chapter13\\IOandTryWithResources\\testFolder\\hello.txt";

    public static void main(String[] args) throws IOException {

        File myFile = new File(filePath);
        boolean b = myFile.renameTo(new File("C:\\Users\\Nare\\IdeaProjects\\javaCore\\src\\chapter13\\IOandTryWithResources\\testFolder\\hello4.txt"));
        System.out.println(b);

        //System.out.println(myFile.exists());

//        if (!myFile.exists()) {
//            boolean newFile = myFile.createNewFile();
//            System.out.println(newFile);
//        }
//
//        System.out.println("is file = " + myFile.isFile());
//        System.out.println("is directory = " + myFile.isDirectory());
//
//        if (myFile.isDirectory()) {
//            File[] files = myFile.listFiles();
//            for (File file : files) {
//                System.out.println(file.getName());
//            }
//        }

        //System.out.println(myFile.getName());


    }
}
