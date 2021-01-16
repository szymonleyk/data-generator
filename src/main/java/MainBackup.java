//import com.google.gson.Gson;
//import org.json.simple.JSONArray;

import java.io.*;
import java.util.Scanner;


public class MainBackup {
    private static final Scanner scanner = new Scanner(System.in);
    private static final StreetsNr lists = new StreetsNr();
//    public static final FileWriter writer = new FileWriter;

    public static void main(String[] args) throws IOException {
        readStreetsFromFile();

        boolean quit = true;
        int choice;
        printInstructions();

        while (quit) {
            System.out.print("Enter your choice (Press 0 - To print choice options):");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    lists.printStreetsList();

                    // Convertation of streets.txt to JSON String.

//    String json = new Gson().toJson(lists.streetsList);
//                    System.out.println(json);
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

//            BufferedReader file = new BufferedReader(new InputStreamReader(is));
    }

    // Reads list of streets from streets.txt and adds them to an ArrayList. -> streetsList
    public static void readStreetsFromFile() throws IOException {

        try (InputStream is = StreetsNr.class.getResourceAsStream("/streets.json")) {

            BufferedReader file = new BufferedReader(new InputStreamReader(is));
            for (; ; ) {
                String line = file.readLine();
                if (line == null) {
                    break;
                }
                lists.getStreetsList().add(line);
            }

        }
    }

    public static void printInstructions() {
        System.out.println("\nPress 0 - To print choice options\n" +
                "1 - To print the list of streets.\n" +
                "2 - To add a street to the list\n" +
                "3 - To search for a street in the list\n" +
                "4 - To generate a number of streets from the list\n" +
                "5 - To quit the application");
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
