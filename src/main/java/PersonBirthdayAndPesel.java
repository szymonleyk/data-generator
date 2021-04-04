import java.time.LocalDate;

public class PersonBirthdayAndPesel {
    private int day;
    private int month;
    private int year;
    private String pesel;
    private LocalDate localDate;

    public PersonBirthdayAndPesel(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public PersonBirthdayAndPesel(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Data urodzenia: " + String.valueOf(localDate) + "\n"
                + "Pesel: " + pesel;
    }
}