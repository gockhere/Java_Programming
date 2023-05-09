package day35_polymorphism;

import day32_finalKeyword.carTask_methodoverriding.BMW;
import day34_abstraction.animalTask.*;
import day35_polymorphism.transportationTask.*;

public class PolymorphismPractice {
    public static void main(String[] args) {


        Animal tiger= new Tiger("Sher Khan","bengal",'M',5,"Large","Orange");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
       // tiger.hunt();

        Animal animal= new Eagle("John","Bald Eagle",'M',3,"Small","Black");

        // animal.fly();

        animal.eat();
        animal.sleep();
        animal.drink();

        Flyable obj1= new Eagle("John","Bald Eagle",'M',3,"Small","Black");

      //  obj1.eat();
      //  obj1.sleep();
      //  obj1.drink();
        obj1.fly();

        System.out.println(obj1.canFly);

        Lion lion=null;

        Parrot parrot=null;

        Shark shark=null;

        Dolphin dolphin=null;

        Eagle eagle=null;

        Duck duck=null;

        Dog dog= null;

        Cat cat= null;

        CydeoCar cydeoCar=null;



        Flyable[] birds={parrot, eagle,duck};

        Swimmable[] fishes={shark,dolphin,duck};

        Playable [] friendlyAnimals={cat,dog,duck,dolphin};



        boolean isAnimal=dog instanceof Animal;

        System.out.println(isAnimal);

        System.out.println("-------------------------------------------------------------------------");

        Car car = new Tesla("Tesla","model y","white",2021,55000);

        boolean isTesla= car instanceof Tesla;

        boolean isAudi= car instanceof Audi;

        boolean isElectricCar= car instanceof Electric;

        boolean hasAutoPark= car instanceof AutoPark;

        boolean hasAutoPilot= car instanceof  AutoPilot;

        System.out.println("isTesla ="+isTesla);

        System.out.println("isAudi ="+isAudi);

        System.out.println("is electric ="+isElectricCar);

        System.out.println("is auto park ="+hasAutoPark);

        System.out.println(" hasAutoPilot ="+hasAutoPilot);














    }
}
