import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class PostCodeCity {

    private final ArrayList<String> listOfPostCodeCity;
    private final Random random;
    private JSONArray jsonArray;

    public PostCodeCity() {
        listOfPostCodeCity = new ArrayList<>();
        random = new Random();
    }

    public void drawData(int numberOfDrawedValues) throws Exception {
        jsonMethod();
        for (int i = 0; i <= numberOfDrawedValues; i++) {
            int num = random.nextInt(jsonArray.size());
            listOfPostCodeCity.add(jsonArray.get(num).toString());
        }
    }

    public ArrayList<String> getDrawedListOfPostCodeCity(){
        return listOfPostCodeCity;
    }

    private void jsonMethod() throws Exception {
        JSONParser jsonParser = new JSONParser();
        //potrzebuję lepszego rozwiązania odczytu pliku .json
        JSONObject jsonObject = (JSONObject) jsonParser.parse((new FileReader("src/main/resources/postCodeCityList.json")));
        jsonArray = (JSONArray) jsonObject.get("postCodeCityList");
    }
}
