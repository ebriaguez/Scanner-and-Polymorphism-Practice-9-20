
//going to extend
//Dog is subclass/child
//Work is parent
public class Dog extends Animal {
    //everything should be private for good practice
    private boolean tail;

    //inheritance all of it properties
    public Dog(String name, String food, int age, String sex, boolean tail) {
        //super referring to parent
        super(name, food, age, sex);
        this.tail = tail;
    }

    //generate getter and setter
    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }
}
