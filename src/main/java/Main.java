
public class Main {

    public static void main(String[] args) {


        //Class initialization area
        //e.g. ExampleClass className = new ExampleClass();
        //e. g. ExampleClass className2 = new ExampleClass(numberOfDraws);
        Names.generateNames(15);
        DateAndPeselGenerator dateAndPeselGenerator = new DateAndPeselGenerator();
        dateAndPeselGenerator.createRandomDate(15);
        dateAndPeselGenerator.getDate();
        //methods placement area
        //e.g. className.setNumberOfDraws(numberOfDraws);
        //e.g. className.getNames(numberOfDraws);


        //Print area
        //e.g. System.out.println(clasName.getDraws);
        //System.out.println(PostCodeCity.generatePostCodeCity(15));
        System.out.println(Names.getListOfNames());


    }

}