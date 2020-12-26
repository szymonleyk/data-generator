import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StreetsNr {

    public ArrayList<String> streetsList = new ArrayList<String>();
    Random rand = new Random();
    Scanner s = new Scanner(System.in);

    //Draws random number of streets from the ArrayList.
    public void drawStreetsFromList() {

        System.out.println("Enter the number of streets to be drawed:");
        Random r = new Random();
        int num = s.nextInt();
        r.nextInt(num);
        int pos = streetsList.indexOf(num);
        System.out.println(pos);
        System.out.println(streetsList.get(num));

    }

    //converting ArrayLists to JSON
//    List<String> foo = new ArrayList<String>();
//foo.add("A");
//foo.add("B");
//foo.add("C");
//
//    String json = new Gson().toJson(foo );

//    Other examples
//    JSONArray jsonA = JSONArray.fromObject(mybeanList);
//System.out.println(jsonA);

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