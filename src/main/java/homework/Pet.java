package homework;

public class Pet {

    /*Part 2:
Create a Pet class, and a subclass for each type of pet that you want your program to support.
Your classes should follow the following requirements:
You must support at least three types of pets - check
Dog must be one of the types you support - check
Cat must be one of the types you support - check
The Pet class must have a speak method that each subclass overrides. - check
The Pet class must have a name field with setters and getters - check
Use the tests provided as examples to write your own tests for other supported types of pets.*/

    //declare my variables that I want to use on main
    //I want my pets to all have a name, age, breed, and size/weight
    public int age;
    public String breed, name, speak;
    public double weight;


    //using generator option to generate a parameterized constructor
    public Pet(int age, String breed, String name, String speak, double weight) {
        this.age = age;
        this.breed = breed;
        this.name = name;
        this.speak = speak;
        this.weight = weight;
    }

    //name getter and setter
    //'getter' returns a variable
    public String getName(){
        return this.name;
    }

    //'setter' sets a value
    public void setName(String name){
        this.name = name;
    }

    //using toString() method


    @Override
    public String toString() {
        return "Pet{" +
                "age=" + age +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", speak='" + speak + '\'' +
                ", weight=" + weight +
                '}';
    }

    //getter and setter for speak
    //getter
    public String getSpeak(){
        return this.speak;
    }

    //setter
    public void setSpeak(String speak){
        this.speak = speak;
    }


    //speak method that will override in subclasses
    //it's void because you don't want it to return anything
    public static void petSpeaking(Pet pet){
        if(pet instanceof Cat){
            System.out.println(pet.speak);
        } else if (pet instanceof Dog){
            System.out.println(pet.speak);
        } else if (pet instanceof Lizard){
            System.out.println(pet.speak);
        } else {
            System.out.println(" ");
        }
    }
}
