package lcp;

public class Dog implements Sound, Walk {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
 
    @Override
    public void walk() {
        System.out.println("Dog is walking.");
    }
}