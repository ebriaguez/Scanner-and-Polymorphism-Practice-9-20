package homework;

public class Main {
    public static void main(String[] args) {
        //main method to pass my objects

        //object one
        Cat cat = new Cat(1, "Bombay","Kai", "MEOWWWWW", 3.0, "lazer pointer");
        //setter
        cat.setName("Kai Bai");
        //getter
        System.out.println(cat.getName());

        //object two
        Dog dog = new Dog(5, "Golden Retriever", "Bruno", "ROOOF ROOF",  9.5, true);
        //setter
        dog.setName("Brunito");
        //getter
        System.out.println(dog.getName());

        //object three
        Lizard lizard = new Lizard(8,"Blue Iguana", "Lizzy", "sssss", 1.5, 0.5);
        //setter
        lizard.setName("Liz");
        //getter
        System.out.println(lizard.getName());

        //prints hashcode - error, need toString to print values of objects
//        System.out.println(cat);
//        System.out.println(dog);
//        System.out.println(lizard);

        //how can I view the subclass values?

    }
}
