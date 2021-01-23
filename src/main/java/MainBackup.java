import java.io.IOException;

public class MainBackup {

    public static void main(String[] args) throws IOException {

        StreetsNr test = new StreetsNr();
        test.readStreetsList();
        System.out.println(test.generateStreetsList(66));

    }
}
