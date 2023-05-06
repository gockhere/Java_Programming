package day25_constructors;

import java.time.LocalDate;

public class TestEmployeeObjects {


    public static void main(String[] args) {


        Employee e1=new Employee("goker",33,'M',"Sdet",135000, LocalDate.of(2022,12,2));

        Employee e2=new Employee("Mohammad",32,'M',"Project Manager",120000,LocalDate.of(2021,5,1));








        System.out.println(e1);

        System.out.println(e2);


    }


}
