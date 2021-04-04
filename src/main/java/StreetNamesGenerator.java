import java.util.ArrayList;

public class StreetNamesGenerator {

    private final ArrayList<String> groupOfStreets = new ArrayList<String>();


    public void addStreetName(String strName) {
        groupOfStreets.add(strName);
    }

    public void printAllStreets() {
        System.out.println("You have " + groupOfStreets.size() + " streets on your list");
        for (int i = 0; i < groupOfStreets.size(); i++) {
            System.out.println((i + 1) + ". " + groupOfStreets.get(i));
        }
    }

    public String findAStreet(String searchItem) {

        int position = groupOfStreets.indexOf(searchItem);
        if (position >= 0) {
            return groupOfStreets.get(position);
        }
        return null;
    }

}
