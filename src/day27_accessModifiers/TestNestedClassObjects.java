package day27_accessModifiers;

public class TestNestedClassObjects {

    public static void main(String[] args) {


        Car obj1 = new Car(); //car object

       Car.CarEngine obj2=obj1.new CarEngine(); //car engine object

        new Car.StaticInnerClass();

    }
}
