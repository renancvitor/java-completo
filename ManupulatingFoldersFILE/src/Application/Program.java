package Application;

import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a folder path:  ");
        String strPath = scanner.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders:");
        for (File folder : folders) {
            System.out.println(folder);
        }
        System.out.println();

        File[] files = path.listFiles(File::isFile);
        System.out.println("Files");
        for (File file : files) {
            System.out.println(file);
        }
        System.out.println();

        boolean success = new File(strPath + "\\JavaTest").mkdir();
        System.out.println("Directory created successfully: " + success);

        scanner.close();
    }
}
