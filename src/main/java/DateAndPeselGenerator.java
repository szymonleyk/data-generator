import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DateAndPeselGenerator {
    private Random random = new Random();
    private LocalDate localDate;
    private List<PersonBirthdayAndPesel> persons = new ArrayList<>();
    Names name = new Names();
    public List<String> createRandomDate(int personCount) {
        List<String> peselPerson = new ArrayList<>();
        for (int i = 0; i < personCount; i++) {
            int day = createRandomIntBetween(1, 31);
            int month = createRandomIntBetween(1, 12);
            int year = createRandomIntBetween(1920, 2020);

            try {
                localDate = LocalDate.of(year, month, day);
            }catch (DateTimeException e){
                day = createRandomIntBetween(1, 28);
                localDate = LocalDate.of(year, month, day);
            }
            int sexId = Names.getListOfNames().get(i).getSex();
            int pesel = random.nextInt(100) + 999;
            PersonBirthdayAndPesel personBirthdayAndPesel = new PersonBirthdayAndPesel(localDate);
            personBirthdayAndPesel.setPesel(localDate.toString().replace("-", "").substring(2, 8) + pesel + getSexId(sexId));
            persons.add(personBirthdayAndPesel);
          //  peselPerson.add(personBirthdayAndPesel.toString());
        }
        return peselPerson;
    }

    private int getSexId(int sexId) {

        int[] oddNumber = {0, 2, 4, 6 ,8};
        int[] evenNumber = {1, 3, 5, 7, 9};
        int id = random.nextInt(5);
        if(sexId == 2) {
            return oddNumber[id];
        }
        else
            return evenNumber[id];
    }


    public int createRandomIntBetween(int start, int end) {
        return  start + (int) Math.round(Math.random() * (end - start));
    }
    public void getDate(){
        for (int i = 0; i < persons.size(); i++) {
          System.out.println(persons.get(i));
        }
    }

}