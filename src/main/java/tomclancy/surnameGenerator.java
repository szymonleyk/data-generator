package tomclancy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class surnameGenerator {
    private Scanner scanner = new Scanner(System.in);
    private final ArrayList<String> femaleLetters = new ArrayList<>(Arrays.asList("ska", "cka", "zka"));
    private final ArrayList<String> maleLetters = new ArrayList<>(Arrays.asList("ski", "cki", "zki"));
    private final ArrayList<String> womenSurnameList = new ArrayList<>();
    private final ArrayList<String> menSurnameList = new ArrayList<>();
    private int number;


    public void readFile() throws Exception {
        try {
            File file = new File("\\surnames.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String allStrings;
            while ((allStrings = br.readLine()) != null) {
                if (allStrings.endsWith(femaleLetters.get(0)) || allStrings.endsWith(femaleLetters.get(1)) || allStrings.endsWith(femaleLetters.get(2))) {
                    womenSurnameList.add(allStrings);
                } else {
                    menSurnameList.add(allStrings);
                }
                if (allStrings.endsWith(maleLetters.get(0)) || allStrings.endsWith(maleLetters.get(1)) || allStrings.endsWith(maleLetters.get(2))) {
                    continue;
                } else {
                    womenSurnameList.add(allStrings);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void femaleSurname() {
        for (int i = 0; i < number; i++) {
            int rnd = new Random().nextInt(womenSurnameList.size());
            System.out.println(womenSurnameList.get(rnd));
        }
    }

    public void maleSurname() {
        for (int i = 0; i < number; i++) {
            int rnd = new Random().nextInt(menSurnameList.size());
            System.out.println(menSurnameList.get(rnd));
        }
    }

    public  void startGenerator() {
        System.out.println("Welcome the Surname Magic Generator");
        System.out.println("Please set how many surnames do you need and press 'm' if you want generate top male's surnames or just the letter 'f' like female...guess what happens");
        System.out.println("Ok. Let's try to do sth!!!");
        System.out.print("How many surnames do you need?: ");
        number = scanner.nextInt();
        System.out.print("Ok! Great So, you want to generate these names for women['f']  or men['m']?: ");
        char gender = scanner.next().charAt(0);

        switch(gender) {
            case 'f':
                femaleSurname();
                break;
            case 'm':
                maleSurname();
                break;
            default:
                System.out.println("error, wrong input data. Oouh no! I haven't the loop statement...this is ridiculous! Bye!");
        }
        }
}