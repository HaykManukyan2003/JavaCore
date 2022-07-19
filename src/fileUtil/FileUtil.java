package fileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    // C:\Users\Nare\IdeaProjects\javaCore\src\chapter13\IOandTryWithResources\testFolder\

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        //fileSearch();
        //recursiveContentSearch(new File("C:\\Users\\Nare\\IdeaProjects\\javaCore\\src\\chapter13\\IOandTryWithResources\\testFolder\\"), "java");
        //findLines();
        //printSizeOfPackage();
        //createFileWithContent();
    }

    static void fileSearch() {
        System.out.println("Input folder path");
        String path = input.nextLine();
        System.out.println("Input file name");
        String fileName = input.nextLine();

        File newFile = new File(path, fileName);
        System.out.println(newFile.exists());
    }

    // -------------------------------------------------------------------------

    private static void recursiveContentSearch(File filePath, String keyword) {
        if (filePath.isDirectory()) {
            File[] files = filePath.listFiles();
            assert files != null;
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file.getAbsolutePath()))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            if (line.contains(keyword)) {
                                System.out.println(file.getName());
                                break;
                            }
                        }
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                } else if (file.isDirectory()) {
                    recursiveContentSearch(file, keyword);
                }
            }
        }
    }

    // -------------------------------------------------------------------------

    static void findLines() {
        System.out.println("Input file path");
        String filePath = input.nextLine();
        System.out.println("Input keyword you want to search in file");
        String keyword = input.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int rowCount = 0;
            String text;
            while ((text = reader.readLine()) != null) {
                rowCount++;
                if (text.contains(keyword)) {
                    System.out.println(rowCount + ": " + text);
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    // -------------------------------------------------------------------------

    static void printSizeOfPackage() {
        System.out.println("Input folder path");
        String folderPath = input.nextLine();

        File newFile = new File(folderPath);
        long folderSize = 0;
        if (newFile.isDirectory()) {
            File[] files = newFile.listFiles();
            assert files != null;
            for (File file : files) {
                folderSize += file.length();
            }
            System.out.println("folderSize: " + folderSize + "kb");
        }
    }

    // -------------------------------------------------------------------------

    static void createFileWithContent() {
        System.out.println("Input folder path");
        String folderPath = input.nextLine();
        System.out.println("Input file name you want to create");
        String newFileName = input.nextLine();
        System.out.println("Input any text you want to see in " + "'" + newFileName + "'");
        String content = input.nextLine();

        String path = folderPath + newFileName;
        File file = new File(path);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}
