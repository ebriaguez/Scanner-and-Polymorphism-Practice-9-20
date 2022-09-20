public class Main {
    public static void main(String[] args) {
        //create objects
        Animal dog = new Animal("doggy", "kibble", 2, "female");
//        dog.name = "dog"; //access property to change
        //have access to properties, but not modify it
        //encapsulating - hiding data. only accessible in class

        //using setter
//        dog.setName("Bob");
        dog.setAge(2);
        System.out.println(dog.getAge());
        //use getter
//        System.out.println(dog.getName());

        //second object
        Animal cat = new Animal("catty", "wet food", 3, "male");

        //using subclass/child dog
        //creating a more concrete class from the main
        Dog dog1 = new Dog("Perro","kibble", 2, "male", true);

        //make a new cat object
        Cat cat1 = new Cat("boob", "wet", 2, "female");

        //create an array of animals - animal objects
        Animal[] animals = {dog1, cat1};
        //modify to take an array of animals**


        //use generated toString();
        System.out.println(dog);
        System.out.println(cat);
    }
}
