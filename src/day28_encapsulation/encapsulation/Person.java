package day28_encapsulation.encapsulation;

import java.time.LocalDate;

public class Person {


    private String name;

    private int age;

    private char gender;

    private LocalDate dateOfBirth;

    public Person(String name, int age, char gender, LocalDate dateOfBirth) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDateOfBirth(LocalDate.of(1989,10,26));
    }

    public String getName() {
        if(name==null){
            System.err.println("can not be empty or null");
        }
        return name;
    }

    public void setName(String name) {
        if(name.isBlank()||name.isEmpty()){
            System.err.println("unknown");
        }
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if(age>120||age<16){
            System.err.println("invalid age");
        }
        this.age = age;
    }

    public char getGender() {

        return gender;
    }

    public void setGender(char gender) {
        if(gender=='F' || gender=='M') {
            this.gender = gender;
        }else {
            System.err.println("invalid gender");
            System.exit(1);
        }

    }

    public LocalDate getDateOfBirth() {

        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if (dateOfBirth.isAfter(LocalDate.now())){
            System.err.println("invalid birthdate ");
        }
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", dateOfBirth=" + getDateOfBirth()+
                '}';
    }
}


/*
name,age,gender,date of birth

name:  write: can not be empty or null
        read :if name is not , return unknown instead

age:    write : age can not be less than zero or greater than 120

gender:  write : can be only f or m

date of birth :   write can not be after todays date


add constructor that can  set all the fields

add toString
 */