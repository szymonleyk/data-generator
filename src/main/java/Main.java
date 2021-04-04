public class Main {

    public static void main(String[] args) {
         final int numberOfDraws = 15;

        //Class initialization area
        //e.g. ExampleClass className = new ExampleClass();
        //e. g. ExampleClass className2 = new ExampleClass(numberOfDraws);
        PostCodeCity postCodeCity = new PostCodeCity();

        StreetNamesGenerator streets = new StreetNamesGenerator();
        streets.printAllStreets();

        //methods placement area
        //e.g. className.setNumberOfDraws(numberOfDraws);
        //e.g. className.getNames(numberOfDraws);
            try {
                postCodeCity.drawData(numberOfDraws);
            } catch (Exception e) {
                e.printStackTrace();
            }


        //Print area
        //e.g. System.out.println(clasName.getDraws);
        System.out.println(postCodeCity.getDrawedListOfPostCodeCity());
    }

}
