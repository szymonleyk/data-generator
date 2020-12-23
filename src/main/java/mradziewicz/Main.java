package mradziewicz;

public class Main {
    public static void main(String[] args) {
        DateAndPeselGenerator dateAndPeselGenerator = new DateAndPeselGenerator();
        dateAndPeselGenerator.createRandomDate(100);
        dateAndPeselGenerator.getDate();
    }
}