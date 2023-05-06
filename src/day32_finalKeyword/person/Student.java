package day32_finalKeyword.person;

import java.time.LocalDate;

public class Student extends Person{

    private char grade;

    public Student(String name, char gender,  LocalDate DOB, char grade) {
        super(name, gender,  DOB);
        setGrade(grade);
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", DOB=" + getDOB()+
                "grade=" + grade +
                '}';
    }
}
