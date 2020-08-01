public class Cat extends Animal {

    public Cat(int yearOfBirth) {
        super(yearOfBirth);
    }

    @Override
    public int calculateAge() {
        return super.calculateAge();
    }

    @Override
    public String makeNoise() {
        return "Meow";
    }
}
