package day17_customClass;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public String employeeId;


    public void setInfo(String name, int age, char gender, String jobTitle, double salary, String employeeId) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeId = employeeId;



    }

    // sets all the attributes of the employee object at once


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }

    public void work(){

        System.out.println(name+" is working");


    }



}
