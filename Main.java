import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final StreetsNr streetsList = new StreetsNr();


    public static void main(String[] args) {
        boolean quit = true;
        int choice = 0;
        printInstructions();

        while(quit){
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    streetsList.printStreetsList();
                    break;
                case 2:
                    addName();
                    break;
                case 3:
                    findStreet();
                    break;
                case 4:
                    quit = false;
                    break;
            }
        }

    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of streets.");
        System.out.println("\t 2 - To add a street to the list");
        System.out.println("\t 3 - To search for a street in the list");
        System.out.println("\t 4 - To quit the application");
    }

    public static void addName(){
        System.out.print("Please enter the street name: ");
        streetsList.addStreetName(scanner.nextLine());
    }

    public static void findStreet(){
        System.out.print("Street name to search for: ");
        String searchItem = scanner.nextLine();
        if(streetsList.findAStreet(searchItem) !=null){
            System.out.println("Found " + searchItem + " street in our list.");
        }else{
            System.out.println(searchItem + " is not in the list");
        }
    }

}
