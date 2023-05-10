package day33_abstraction.employeeTask;

public class TestEmployeeObjects {
    public static void main(String[] args) {


     // Employee employee= new Employee("Daniel",54,'M',"A1","SDET",12322);
        // WE CAN NOT CREATE OBJECTS FROM ABSTRACT CLASS , OBJECT MUST BE CREATED FROM A CONCRETE CLASS

        Teacher teacher= new Teacher("James",45,'M',"B1","Math teacher",75000);

        Developer developer=new Developer("Lucy",30,'F',"C1","Java Developer",95000,"Java");

        Driver driver=new Driver("Aaron",23,'M',"d1","Truck driver",90000);

        Tester tester=new Tester("Emily",35,'F',"f1","Manual Tester",80000);

        System.out.println(teacher);

        System.out.println(tester);

        System.out.println(driver);

        System.out.println(developer);


        System.out.println("--------------------------------------------------------");


        teacher.work();

        developer.work();

        tester.work();

        driver.work();

    }
}
