import java.util.ArrayList;

public class StreetsNr{

    private final ArrayList<String> streetsList = new ArrayList<String>();


    public void addStreetName (String strName){
    streetsList.add(strName);

}

    public void printStreetsList() {
        System.out.println("You have " + streetsList.size() + " streets on your list");
        for(int i = 0; i < streetsList.size(); i++){
            System.out.println((i+1) + ". " + streetsList.get(i));
        }
    }

    public String findAStreet(String searchItem){

        int position = streetsList.indexOf(searchItem);
        if(position >=0){ // Because if the .idexOf function will return -1, it will mean that the file don't exists.
            return streetsList.get(position);
        }
        return null;
    }

}
