package day32_finalKeyword.person;

import java.rmi.ServerError;
import java.time.LocalDate;

public class Person {

    private String name;
    private final char gender;
    private final int age;
    private final LocalDate DOB;

    public static final int numberOfHead;


    static {
        numberOfHead=1;
    }

    public Person(String name, char gender,  LocalDate DOB) {
        setName(name);
        if(!(gender=='F'||gender=='M')){
            System.err.println("invalid gender: "+gender);
            System.exit(1);
        }
        this.gender = gender;


        this.DOB = DOB;
        this.age = LocalDate.now().getYear()- DOB.getYear();
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat (){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public final void breath(){
        System.out.println(name+" is breathing");
    }// to make sure that this implementation will not change for any subclass


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", DOB=" + DOB +
                '}';
    }
}


/*
Variables:
name,gender,age,dateOfBirth,
numberOfHeads

Methods:

eat(food),drink(drink), sleep().
breath()


 */