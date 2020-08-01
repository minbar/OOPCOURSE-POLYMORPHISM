public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal(2016);
        Animal dog = new Dog(2016);
        Animal cat = new Cat(2016);

        System.out.println(animal.makeNoise());
        System.out.println(dog.makeNoise());
        System.out.println(cat.makeNoise());
    }
}