package tomclancy;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
            surnameGenerator newSurname = new surnameGenerator();
            newSurname.readFile();
            newSurname.startGenerator();
       }
}