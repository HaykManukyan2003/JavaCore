package fileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        //fileSearch();
        //contentSearch();
        //findLines();
        //printSizeOfPackage();
        //createFileWithContent();

    }

    static void fileSearch() {
        System.out.println("Input file path");
        String path = input.nextLine();
        System.out.println("Input file name");
        String fileName = input.nextLine();

        File file = new File(path);
        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.getName().equals(fileName) && f.isFile()) {
                    System.out.println(true);
                    return;
                }
            }
            System.out.println(false);
        } else System.out.println(false);
    }

    static void contentSearch() {
        System.out.println("Input file path");
        String path = input.nextLine();
        System.out.println("Input keyword");
        String keyword = input.nextLine();

        File newFile = new File(path);
        if (newFile.exists() && newFile.isDirectory()) {
            File[] files = newFile.listFiles();
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
                }
            }
        }
    }

    static void findLines() {
        System.out.println("Input file path");
        String filePath = input.nextLine();
        System.out.println("Input keyword");
        String keyword = input.nextLine();

        File newFile = new File(filePath);
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    static void printSizeOfPackage() {
        System.out.println("Input folder path");
        String folderPath = input.nextLine();

        File newFile = new File(folderPath);
        double folderSize = 0;
        if (newFile.isDirectory()) {
            File[] files = newFile.listFiles();
            for (File file : files) {
                folderSize += file.length();
            }
            System.out.println("folderSize: " + folderSize);
        }
    }

    static void createFileWithContent() throws IOException {
        System.out.println("Input folder path");
        String folderPath = input.nextLine();
        System.out.println("Input file name you want to create");
        String newFileName = input.nextLine();
        System.out.println("Input any text you want to see in " + "'" + newFileName + "'");
        String content = input.nextLine();

        StringBuilder path = new StringBuilder(folderPath);
        path.append(newFileName);
        File folder = new File(String.valueOf(path));
        boolean created = folder.createNewFile();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(folder))){
            writer.write(content);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}
