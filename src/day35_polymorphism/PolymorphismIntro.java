package day35_polymorphism;

import day31_inheritance.shape_methodOverriding.Circle;
import day33_abstraction.employeeTask.*;
import day34_abstraction.animalTask.*;
import day34_abstraction.carTask.Audi;
import day34_abstraction.carTask.Car;
import day34_abstraction.carTask.Honda;
import day34_abstraction.carTask.Tesla;

import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {

       Dog dog= new Dog("Max","Husky",'M',4,"Small","White");

        Cat cat =new Cat("Max","Husky",'M',4,"Small","White");

        Tiger tiger=null;

        Eagle eagle=null;

        Lion lion=null;

        Parrot parrot=null;

        Dolphin dolphin=null;

        Shark shark=null;

        Duck duck=null;

        Animal[] animals={dog,cat,tiger,lion,eagle,duck,dolphin,shark,parrot};

       // Animal animal= new Tesla("Model 3","White",2022,65000);
        // there is not "IS A" relationship between animals and tesla

        Animal animal=new Dog("Max","Husky",'M',4,"Small","White");

        animal.eat();
        animal.drink();
        animal.sleep();

       // animal.play();
        //animal.bark();

        System.out.println("-------------------------------------------------------------");

        String str="Java";

        Integer n = 100;
        Boolean r=false;
        Double d=10.4;

        Circle circle=new Circle(4);


        Honda honda=new Honda("Pilot","Black",2019,35000);
        Audi audi=new Audi("Q6","Silver",2020,36000);
        day34_abstraction.carTask.Tesla tesla=new Tesla("Model Y","Blue",2022,60000);

        Teacher teacher= new Teacher("James",45,'M',"B1","Math teacher",75000);

        Developer developer=new Developer("Lucy",30,'F',"C1","Java Developer",95000,"Java");

        Driver driver=new Driver("Aaron",23,'M',"d1","Truck driver",90000);

        Tester tester=new Tester("Emily",35,'F',"f1","Manual Tester",80000);


        Object[] objects={str,n,r,d,circle,honda,audi,tesla,teacher,developer,driver,tester};


        System.out.println(Arrays.toString(objects));

     Employee[] employees={teacher,driver,tester,developer};

     Employee obj= new Teacher("James",45,'M',"B1","Math teacher",75000);

     obj.work();

     System.out.println("==============================================");







    }
}
