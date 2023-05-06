package day31_inheritance.animal_methodOverriding;

public class Lion extends Animal{

    private boolean isAfricanLion;

    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfricanLion) {
        super(name, breed, gender, age, size, color);
        setAfricanLion(isAfricanLion);
    }

    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    @Override
    public void eat() {
        System.out.println("lion "+getName()+" is eating deer");
    }

    public void roar(){
        System.out.println("lion "+getName()+" is roaring");
    }

    @Override
    public String toString() {
        return super.toString().replace("}"," ")+
                ", African Lion='" + isAfricanLion + '\'' +
                '}';
    }
}
