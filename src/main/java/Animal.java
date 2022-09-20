public class Animal {

    //create two instance variables
    //give it a name and food
    //how to generate concrete constructor
//    public String name, food; //we made these names public - instance variables
    //default, private, protected, public

    private String name, food, noise;
    //classwork - add private property
    private int age;
    //classwork - protected property - accessible to subclasses
    protected String sex;

    public Animal(String name, String food, int age, String sex) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.sex = sex;
    }

    //getter method
    public String getName(){
        return this.name; //a getter
    }

    //classwork getter
    public int getAge(){
        return this.age;
    }

    //classwork setter

    public void setAge(int age){
        this.age = age;
    }

    //create a method that returns nothing
    //setter method
    public void setName(String name){ //give me that name
        //storing that name in this instance
        this.name = name;
    }


    //string representation
    @Override
    public String toString() {
        return "Work{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                '}';
    }

    public void setNoise(String noise){
        this.noise = noise;
    }

    //create a method that makes noise
    public static void makeNoise(Animal animal){ //pass in - means parameter; this can take any object that can take Animal
        if(animal instanceof Dog){
            System.out.println(animal.noise);
        }else if (animal instanceof Cat){
            System.out.println(animal.noise);
        }else{
            System.out.println(" ");
        }
    }


    //create a method that will take an array of animals and prints out each animals name in this class and you will use it in main
    //call it on the object (in main)
}