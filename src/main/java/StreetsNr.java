import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StreetsNr {

    private final ArrayList<String> streetsList = new ArrayList<>();
    Random r = new Random();
    Scanner s = new Scanner(System.in);


    public ArrayList<String> generateStreetsList(int numberToDraw) throws IOException {
        // Reads list of streets from streets.txt/json and adds them to an ArrayList. -> streetsList
        try (InputStream is = StreetsNr.class.getResourceAsStream("/streets.json")) {

            BufferedReader file = new BufferedReader(new InputStreamReader(is));
            for (; ; ) {
                String line = file.readLine();
                if (line == null) {
                    break;
                }
                streetsList.add(line);
            }

        }

        //The loop will reapeat number of times, each time printing 1 name and 1 number, until count i meet entered numberToDraw.
        for (int i = 0; i <= numberToDraw ; i++ ) {

            //Draws random number of streets from the ArrayList.

            numberToDraw = s.nextInt();
            for (int count = 1; count <= numberToDraw; count++) {
                int rand = r.nextInt(4901);
                System.out.println(streetsList.get(rand).indexOf(rand));
            }

            // wylosowanie nr budynku

            numberToDraw = s.nextInt();
            for (int count = 1; count <= numberToDraw; count++) {
                int rand = r.nextInt(4901);
                System.out.println(streetsList.get(rand).indexOf(rand));
            }

            // zlaczenie ulicy z wylosowanym numerem


            // przerobienie na stringa

            // dodanie do arraylisty (finalnej listy)


        }
        return streetsList;
    }
}