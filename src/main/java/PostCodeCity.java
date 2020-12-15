import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.core.io.ClassPathResource;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PostCodeCity {

    private final ArrayList<String> listOfPostCodeCity;
    private PostCodeCityList postCodeCityList;
    private final Random random;
    private JSONArray jsonArray;

    public PostCodeCity() {
        listOfPostCodeCity = new ArrayList<>();
        random = new Random();
    }

    public void drawData(int numberOfDrawedValues) throws Exception {

        //Barney style
        jsonMethod();
        for (int i = 0; i <= numberOfDrawedValues; i++) {
            int num = random.nextInt(getPostCodeCityList().getPostCodeCityList().size());
            listOfPostCodeCity.add(getPostCodeCityList().getPostCodeCityList().get(num));
        }
        //casual style
//        jsonMethod();
//        for (int i = 0; i <= numberOfDrawedValues; i++) {
//            int num = random.nextInt(jsonArray.size());
//            listOfPostCodeCity.add(jsonArray.get(num).toString());
//        }
    }

    private void jsonMethod() throws Exception {
        InputStream inputStream = getClass().getResourceAsStream("/postCodeCityList.json");

        //Barney style
        ObjectMapper objectMapper = new ObjectMapper();
        postCodeCityList = objectMapper.readValue(inputStream, PostCodeCityList.class);

//        //casual style
//        JSONParser jsonParser = new JSONParser();
//        JSONObject jsonObject = (JSONObject) jsonParser.parse(new InputStreamReader(inputStream));
//        jsonArray = (JSONArray) jsonObject.get("postCodeCityList");
    }

    public final PostCodeCityList getPostCodeCityList(){
        return postCodeCityList;
    }

    public final ArrayList<String> getDrawedListOfPostCodeCity(){
        return listOfPostCodeCity;
    }
}
