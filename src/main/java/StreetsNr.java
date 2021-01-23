import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class StreetsNr {

    private final ArrayList<String> streetsList = new ArrayList<>(); // Lista do ktorej wczytuje nazwe ulic z pliku.
    private final ArrayList<String> generatedStreetsList = new ArrayList<>(); // Lista do ktorej się zapisują wylosowane ulicy


    public ArrayList<String> readStreetsList() throws IOException {  // Reads list of streets from streets.txt and adds them to an ArrayList. -> streetsList

        try (InputStream is = StreetsNr.class.getResourceAsStream("/streets.txt")) {

            BufferedReader file = new BufferedReader(new InputStreamReader(is));
            for (; ; ) {
                String line = file.readLine();
                if (line == null) {
                    break;
                }
                streetsList.add(line);
            }
        }

        return streetsList;
    }
    // Solution for dublicates:
    // int[] result = new int[20];
    //
    //HashSet<Integer> used = new HashSet<Integer>();
    //for (int i = 0; i < 20; i++) {
    //    int add = (int)(Math.random() * 30); //this is the int we are adding
    //    while (used.contains(add)) { //while we have already used the number
    //        add = (int) (Math.random() * 30); //generate a new one because it's already used
    //    }
    //    //by this time, add will be unique
    //    used.add(add);
    //    result[i] = add;
    //}
    public ArrayList<String> generateStreetsList(int numberToDraw) {

        //The loop will reapeat number of times, each time adding 1 name and 1 number, until count "i" will meet entered numberToDraw.
        for (int i = 1; i <= numberToDraw; i++) {

            //Draws random number of streets from the ArrayList, then generates a random number
            // and concatenates two variables then finally adds them to a new ArrayList.
            Random rand = new Random();
            int number = rand.nextInt(numberToDraw);
            int numerBudynku = rand.nextInt(numberToDraw);
            generatedStreetsList.add(streetsList.get(number) + " " + numerBudynku);

        }

        return generatedStreetsList;
    }
}


