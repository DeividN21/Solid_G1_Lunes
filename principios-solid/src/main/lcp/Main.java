package lcp;

public class Main {
    public static void main(String[] args) {
        Sound dog = new Dog();
        Sound fish = new Fish();
 
        dog.makeSound();
        ((Walk) dog).walk();
 
        fish.makeSound();
    }
}