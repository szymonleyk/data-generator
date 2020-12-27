import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StreetsNr {

    public ArrayList<String> streetsList = new ArrayList<String>();
    Random r = new Random();
    Scanner s = new Scanner(System.in);

    //Draws random number of streets from the ArrayList.
    public void drawStreetsFromList() {

        System.out.println("Enter the number of streets to be drawed:");

        int rand = r.nextInt();
        if (rand <= 0)
            throw new IllegalArgumentException("bound must be positive");
        else {
            System.out.println(streetsList.get(rand));
        }
    }

    public void addStreetName(String strName) {

        streetsList.add(strName);

    }

    public void printStreetsList() {
        System.out.println("You have " + streetsList.size() + " streets on your list");
        for (int i = 0; i < streetsList.size(); i++) {
            System.out.println((i + 1) + ". " + streetsList.get(i));
        }
    }

    public String findAStreet(String searchItem) {

        int position = streetsList.indexOf(searchItem);
        if (position >= 0) { // Because if the .idexOf function will return -1, it will mean that the file don't exists.
            return streetsList.get(position);
        }
        return null;
    }

}