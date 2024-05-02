package Program;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        File file = new File("C:\\temp\\in.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error openning file:  " + e.getMessage());
        }
        finally {
            if (scanner != null) {
                scanner.close();
            }
            System.out.println("Finally block has been executed");
        }
    }
}
