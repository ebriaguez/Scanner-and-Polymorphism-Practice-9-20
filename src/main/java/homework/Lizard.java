package homework;

public class Lizard extends Pet {
    //special variable
    private double lengthOfTail;

    public Lizard(int age, String breed, String name, String speak, double weight, double lengthOfTail) {
        super(age, breed, name, speak, weight);
        this.lengthOfTail = lengthOfTail;
    }
}
