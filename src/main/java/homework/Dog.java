package homework;

public class Dog extends Pet{
    //declaring special variable
    private boolean hasSpots;

    public Dog(int age, String breed, String name, String speak, double weight, boolean hasSpots) {
        super(age, breed, name, speak, weight);
        this.hasSpots = hasSpots;
    }
}
