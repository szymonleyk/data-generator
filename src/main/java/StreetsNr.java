import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class StreetsNr {

    private final ArrayList<String> streetsList = new ArrayList<>(); // Lista do ktorej wczytuje nazwe ulic z JSON'a
    private final ArrayList<String> newStreetsList = new ArrayList<>(); // Lista do ktorej się zapisują wylosowane ulicy
    private final Random rand = new Random();

    public ArrayList<String> generateStreetsList(int numberToDraw) throws IOException {  // Reads list of streets from streets.txt/json and adds them to an ArrayList. -> streetsList

        try (InputStream is = StreetsNr.class.getResourceAsStream("/streets.json")) {

            BufferedReader file = new BufferedReader(new InputStreamReader(is));
            for ( ; ; ) {
                String line = file.readLine();
                if (line == null) {
                    break;
                }
                streetsList.add(line);
            }

        }

        //The loop will reapeat number of times, each time adding 1 name and 1 number, until count "i" will meet entered numberToDraw.
        for (int i = 1; i <= numberToDraw; i++) {

            //Draws random number of streets from the ArrayList and adding it to a new ArrayList.
            int rand = numberToDraw;
            newStreetsList.add(streetsList.get(rand));

            // wylosowanie nr budynku (NIE WIEM JAK ZROBIC LOSOWONIE NUMEROW OSOBNO Z JSON'a)

//            numberToDraw = s.nextInt();
//            for (int count = 1; count <= numberToDraw; count++) {
//                int rand = r.nextInt(4901);
//                System.out.println(streetsList.get(rand).indexOf(rand));

            // zlaczenie ulicy z wylosowanym numereem & przerobienie na stringa
            // dodanie do arraylisty (finalnej listy)

        }

        return newStreetsList;
    }

}

