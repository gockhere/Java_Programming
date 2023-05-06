package day25_constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    public String name;
    public int age;
    public  char gender;
    public LocalDate dateOfBirth;
    public boolean isMarried;
    public boolean isEmployed;


    public Person(String name, int age, char gender, LocalDate dateOfBirth, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;


    }

    public void eat(){
        System.out.println(name +" is eating");
    }

    public void drink(){
        System.out.println(name +" is drinking water");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth.format(DateTimeFormatter.ofPattern("MM/dd/y")) +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }
}

/*
name
age
gender
date of birth -- mm-dd-yyyy
is married
ie employed

to string(), eat(string food), sleeping(), drink( String drink)
 */
