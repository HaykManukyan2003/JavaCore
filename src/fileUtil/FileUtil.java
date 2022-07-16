package fileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    // C:\Users\Nare\IdeaProjects\javaCore\src\chapter13\IOandTryWithResources\testFolder\

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        //fileSearch();
        //contentSearch();
        //findLines();
        //printSizeOfPackage();
        //createFileWithContent();
    }

    static void fileSearch() {
        System.out.println("Input folder path");
        String path = input.nextLine();
        System.out.println("Input file name");
        String fileName = input.nextLine();

        File newFile = new File(path);
        if (newFile.isDirectory()) {
            File[] files = newFile.listFiles();
            assert files != null;
            for (File file : files) {
                if (file.getName().equals(fileName) && file.isFile()) {
                    System.out.println(true);
                    return;
                }
            }
            System.out.println(false);
        } else System.out.println(false);
    }

    // -------------------------------------------------------------------------

    static void contentSearch() {
        System.out.println("Input directory path");
        String directoryPath = input.nextLine();
        System.out.println("Input keyword you want to search in files");
        String keyword = input.nextLine();
        File filePath = new File(directoryPath);

        recursiveFileSearch(filePath, keyword);
    }

    private static void recursiveFileSearch(File filePath, String keyword) {
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
                    recursiveFileSearch(file, keyword);
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
            String text;
            int line = 0;
            while ((text = reader.readLine()) != null) {
                Scanner scanner = new Scanner(filePath);
                if (scanner.hasNextLine()) {
                    line++;
                }
                if (text.contains(keyword)) {
                    System.out.println(line + ": " + text);
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
        double folderSize = 0;
        if (newFile.isDirectory()) {
            File[] files = newFile.listFiles();
            assert files != null;
            for (File file : files) {
                folderSize += file.length();
            }
            System.out.println("folderSize: " + folderSize);
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
