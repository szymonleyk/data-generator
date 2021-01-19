package mradziewicz;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DateAndPeselGenerator {
    private Random random = new Random();
    private LocalDate localDate;

    public List<String> createRandomDate(int personCount) {
        List<String> date = new ArrayList<>();
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
            int pesel = random.nextInt(100) + 999;
            int sexId= random.nextInt(2);
            PersonBirthdayAndPesel personBirthdayAndPesel = new PersonBirthdayAndPesel(localDate);
            personBirthdayAndPesel.setPesel(localDate.toString().replace("-", ""));
            date.add(personBirthdayAndPesel.toString());
        }
        return date;
    }

    public int createRandomIntBetween(int start, int end) {
        return  start + (int) Math.round(Math.random() * (end - start));
    }
//    public void getDate(){
//        for (int i = 0; i < persons.size(); i++) {
//          System.out.println(persons.get(i));
//        }
//    }

}