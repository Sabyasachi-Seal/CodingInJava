package OOPSPrac;

abstract class Animal{
    public void eat(){
        System.out.println("Eating");
    }
    public abstract void move();
    void greet(){
        System.out.println("hello");
    }
}

public class Dog extends Animal{
    public void move() {
        System.out.println("Moving");
    }
    @Override
    protected void greet(){
        super.greet();
        System.out.println("Hello");
    }
}
