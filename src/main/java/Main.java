import mradziewicz.DateAndPeselGenerator;

public class Main {

    public static void main(String[] args) {
        DateAndPeselGenerator dateAndPeselGenerator = new DateAndPeselGenerator();
        System.out.println(dateAndPeselGenerator.createRandomDate(100));


        //Class initialization area
        //e.g. ExampleClass className = new ExampleClass();
        //e. g. ExampleClass className2 = new ExampleClass(numberOfDraws);


        //methods placement area
        //e.g. className.setNumberOfDraws(numberOfDraws);
        //e.g. className.getNames(numberOfDraws);

        //Print area
        //e.g. System.out.println(clasName.getDraws);
        System.out.println(PostCodeCity.generate(15));
    }

}
