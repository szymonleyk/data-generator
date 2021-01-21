import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;

public class Names {

    //dodaj bazę imion jako zewnętrzny plik (JSON?) (znajdź bazę imion w internecie)

    //w bazie uwzględnij płeć imienia. Może jako lista obiektów?

    //zaciągnij imiona do Javy w taki sposób, aby przy imieniu dało się wygenerować również płeć
    // (1-mężczyzna 2-kobieta - to będą inty)

    //stwórz statyczną metodę zwracającą listę imion (jako obiekty?)

    private String name;
    private int sex;
    private static ArrayList<Names> listOfNames;

    public String getName() {
        return name;
    }

    public int getSex(){
        return sex;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSex(int sex){
        this.sex=sex;
    }

    private static ArrayList<Names> importAllNames() {

        InputStream inputStream = Names.class.getResourceAsStream("/namesList.json");
        ArrayList<Names> allNamesList = new ArrayList<>();

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            allNamesList = objectMapper.readValue(inputStream, new TypeReference<>() {});

        } catch (IOException e){
            e.printStackTrace();
        }

        return allNamesList;
    }

    public static ArrayList<Names> generateNames(int numberOfDrawedValues) {
        listOfNames= new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <= numberOfDrawedValues-1; i++) {
            int num = random.nextInt(importAllNames().size());
            listOfNames.add(importAllNames().get(num));
        }
        return listOfNames;
    }

    protected static ArrayList<Names> getListOfNames() {
        return listOfNames;
    }

    @Override
    public String toString() {
        return "Names{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
