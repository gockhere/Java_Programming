package day32_finalKeyword.person;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {


        Person person = new Person("Daniel",'M', LocalDate.of(1989,10,26));

        System.out.println(person);

        person.breath();

        System.out.println("------------------------------------------");

        Employee employee=new Employee("Goker",'M',LocalDate.of(1991,2,3),"Java developer",134000);

        System.out.println(employee);

        employee.breath();

        System.out.println("---------------------------------------------");

        Student student=new Student("Roni",'M',LocalDate.of(2016,1,17),'A');
        System.out.println(student);
        student.breath();
    }
}
