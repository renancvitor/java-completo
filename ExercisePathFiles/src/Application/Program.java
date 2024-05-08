package Application;

import Entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter a folder path:  ");
        String sourceStrPath = scanner.nextLine();

        File sourceFile = new File(sourceStrPath);
        String sourceFolderStr = sourceFile.getParent();

        boolean success = new File(sourceFolderStr + "\\out").mkdir();
        System.out.println("Directory created successfully: " + success);

        String targetFolder = sourceFolderStr + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceStrPath))) {
            String itemCsv = br.readLine();

            while (itemCsv != null) {
                //System.out.println(itemCsv);

                String[] fields = itemCsv.split(";");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFolder))) {
                for (Product p : list) {
                    bw.write(p.getName() + ", " + String.format("%.2f", p.total()));
                    bw.newLine();
                }
                System.out.println();
                System.out.print(targetFolder + " -  Created");
            }
            catch (IOException e) {
                System.out.println("Error:  " + e.getMessage());
            }
        }
        catch (IOException e) {
            System.out.println("Error:  " + e.getMessage());
        }

        scanner.close();
    }
}
