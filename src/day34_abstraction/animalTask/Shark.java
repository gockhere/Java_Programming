package day34_abstraction.animalTask;

public class Shark extends Animal{
    public Shark(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Sharks "+getName()+ " is eating fish");
    }
}
