package day25_constructors;

import java.time.LocalDate;

public class TestPerson {

    public static void main(String[] args) {


        Person p1 = new Person("Goker", 33, 'M', LocalDate.of(1989, 10, 26), true, true);
        Person p2 = new Person("Gokce", 33, 'M', LocalDate.of(1991,10,24), true, false);
        Person p3 = new Person("Gorkem", 33, 'M', LocalDate.of(2001, 6, 11), true, false);
        Person p4 = new Person("roni", 33, 'M', LocalDate.of(2016, 1, 17), false, true);
        Person p5 = new Person("oznur", 33, 'M', LocalDate.of(1969, 1, 1), false, true);



        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);





        p1.eat();
        p1.sleep();
        p1.drink();
    }


}