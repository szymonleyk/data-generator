import java.io.IOException;
import static org.junit.Assert.*;

public class StreetsNrTest {
    StreetsNr streets = new StreetsNr();

    @org.junit.Test
    public void compareLists() throws IOException{

        streets.readStreetsList();
        assertNotNull(streets.generateStreetsList(5));
        streets.generateStreetsList(5);
//        assertArrayEquals(streets, );

    }

    @org.junit.Test
    public void checkIfGeneratesOnlyPositive() {
        streets.generateStreetsList(5);
        assertTrue("The list doesn't have negative numbers", streets.generatedStreetsList.indexOf(5) > 0);
    }

    @org.junit.Test
    public void checkIfHasDublicates () {
        fail("The test is yet to be implemented");

    }

}