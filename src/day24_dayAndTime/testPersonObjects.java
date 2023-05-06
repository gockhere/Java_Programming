package day24_dayAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class testPersonObjects {
    public static void main(String[] args) {

        Person[] people ={new Person(),new Person(),new Person(),new Person(),new Person()};

        people[0].setInfo("Goker",'M', LocalDate.of(1989,10,26));
        people[1].setInfo("ronie",'M',LocalDate.of(2016,1,17));
        people[2].setInfo("gokce",'F',LocalDate.of(1991,10,24));
        people[3].setInfo("gorkem",'M',LocalDate.of(2001,6,11));
        people[4].setInfo("oznur",'F',LocalDate.of(1969,1,1));




        ArrayList<Person> studentList =  new ArrayList<>();
        studentList.addAll(Arrays.asList(people));

        for (Person each: studentList) {

            System.out.println(each.name+"  "+each.dateOfBirth);

        }

        studentList.removeIf(p -> p.age>35);




        System.out.println(studentList);





        //print name & date of birth of each person object

        //remove all the person object that has the age >35
    }
}
