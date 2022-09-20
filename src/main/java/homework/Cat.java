package homework;

public class Cat extends Pet {
    //declare a variable for only cat
    private String favoriteToy;

    public Cat(int age, String breed, String name, String speak, double weight, String favoriteToy) {
        super(age, breed, name, speak, weight);
        this.favoriteToy = favoriteToy;
    }

    //setter and getter
    //getter
    public String getSpeak(){
        return this.favoriteToy;
    }

    //setter
    public void setSpeak(String favoriteToy){
        this.favoriteToy = favoriteToy;
    }


}
