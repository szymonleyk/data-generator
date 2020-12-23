import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class StreetsNr {

    public ArrayList<String> streetsList = new ArrayList<String>();

    Random rand = new Random();

    //Draws random number of streets from the ArrayList.
    public void drawStreets() {
        Random r = new Random();
        int pos = streetsList.indexOf(r);
        System.out.println(pos);
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