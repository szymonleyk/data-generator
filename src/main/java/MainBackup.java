import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


public class MainBackup {
    private static final Scanner scanner = new Scanner(System.in);
    private static final StreetsNr lists = new StreetsNr();

    public static void main(String[] args) throws IOException {
        readStreetsFromFile();

        boolean quit = true;
        int choice = 0;
        printInstructions();

        while (quit) {
            System.out.print("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    lists.printStreetsList();
                    break;
                case 2:
                    addName();
                    break;
                case 3:
                    findStreet();
                    break;
                case 4:
                    lists.drawStreetsFromList();
                    break;
                case 5:
                    quit = false;
                    break;
            }
        }

    }

    // Reads list of streets from streets.txt and adds them to an ArrayList. -> streetsList
    public static void readStreetsFromFile() throws IOException {

        InputStream is = StreetsNr.class.getResourceAsStream("/streets.txt");
        try {

            BufferedReader file = new BufferedReader(new InputStreamReader(is));
            for (; ; ) {
                String line = file.readLine();
                if (line == null) {
                    break;
                }
                lists.streetsList.add(line);
            }

        } finally {
            if (is != null) {
                is.close();
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of streets.");
        System.out.println("\t 2 - To add a street to the list");
        System.out.println("\t 3 - To search for a street in the list");
        System.out.println("\t 4 - To generate a number of streets from the list");
        System.out.println("\t 5 - To quit the application");
    }

    public static void addName() {
        System.out.print("Please enter the street name: ");
        lists.addStreetName(scanner.nextLine());
    }

    public static void findStreet() {
        System.out.print("Street name to search for: ");
        String searchItem = scanner.nextLine();
        if (lists.findAStreet(searchItem) != null) {
            System.out.println("Found " + searchItem + " street in our list.");
        } else {
            System.out.println(searchItem + " is not in the list");
        }
    }

}
