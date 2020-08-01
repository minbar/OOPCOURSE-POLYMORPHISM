public class Dog extends Animal {

    public Dog(int yearOfBirth) {
        super(yearOfBirth);
    }

    @Override
    public int calculateAge() {
        return super.calculateAge();
    }

    @Override
    public String makeNoise() {
        return "Woof!";
    }
}
