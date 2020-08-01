import java.time.LocalDate;

public class Animal {

    protected int yearOfBirth;

    public Animal(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int calculateAge() {
        return LocalDate.now().getYear() - yearOfBirth;
    }

    public String makeNoise() {
        return "";
    }
}
