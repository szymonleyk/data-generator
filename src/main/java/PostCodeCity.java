import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;

public class PostCodeCity {

    private static ArrayList<String> importAllPostCodeCity() {

        InputStream inputStream = PostCodeCity.class.getResourceAsStream("/postCodeCityList.json");
        ArrayList<String> postCodeCityList = new ArrayList<>();

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            postCodeCityList = objectMapper.readValue(inputStream, ArrayList.class);
        } catch (IOException e){
            e.printStackTrace();
        }
        return postCodeCityList;
    }

    public static ArrayList<String> generatePostCodeCity(int numberOfDrawedValues) {
        ArrayList<String> listOfPostCodeCity= new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <= numberOfDrawedValues; i++) {
            int num = random.nextInt(importAllPostCodeCity().size());
            listOfPostCodeCity.add(importAllPostCodeCity().get(num));
        }
        return listOfPostCodeCity;
    }

}
