package day36_polmorphism;

import day29_inheritance.animalTask.Animal;

import day29_inheritance.animalTask.Cat;
import day29_inheritance.animalTask.Dog;
import day30_inheritance.phoneTask.Iphone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day33_abstraction.employeeTask.*;
import day35_polymorphism.transportationTask.AutoPilot;
import day35_polymorphism.transportationTask.Electric;
import day35_polymorphism.transportationTask.Tesla;

public class ReferenceTypeCastings {
    public static void main(String[] args) {


       Dog dog= new Dog();

       // Cat cat= new Dog();


        Animal animal=(Animal) new Dog(); // implicit casting


        System.out.println("-----------------------------------------------------");

        Animal animal1 = new Dog();

        animal1.setInfo("Max","Husky",'M',4,"Small","White");

        animal1.eat();
        animal1.sleep();
        animal1.drink();

        ((Dog) animal1).bark();  // down casting

      //  Dog dog1= (Dog) animal1;  // down casting

       // dog1.bark();

       // ((Cat)animal1).scratch();//Dog can not be converted to Cat, because there is no relationship between dog and cat


        System.out.println("-----------------------------------------------------------");

        Phone phone = new Nokia("XR20", "Small", 350, "Blue");

        phone.call(911);
        phone.text(1233422);

        ((Nokia) phone).selfDefence();

     //   ((Iphone)phone).faceTime(12343);  //nokia can not be converted to Iphone , because there is no relationship between nokia and iphone



        ((Nokia)phone).selfDefence();

        Employee employee=new Developer("Lucy",30,'F',"C1","Java Developer",95000,"Java");

        employee.work();

        System.out.println(((Developer) employee).getProgrammingLanguage());


      //  Driver driver=(Driver) employee;


     Electric electric= new Tesla("Tesla","Model Y","Blue",2020,55000);

     electric.charge();

     ((Tesla) electric).selfDrive();

     ((AutoPilot)electric).selfDrive();

     System.out.println("------------------------------------------");

     Employee employee1= new Teacher("James",45,'M',"B1","Math teacher",75000);



     Employee employee2=new Developer("Lucy",30,'F',"C1","Java Developer",95000,"Java");




     Employee employee3=new Driver("Aaron",23,'M',"d1","Truck driver",90000);



     Employee employee4=new Tester("Emily",35,'F',"f1","Manual Tester",80000);


     employee1.work();
     employee2.work();
     employee3.work();
     employee4.work();




    }
}
