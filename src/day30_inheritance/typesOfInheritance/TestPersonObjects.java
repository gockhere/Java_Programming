package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {

    public static void main(String[] args) {

        System.out.println();

        Student student = new Student("Roni",'M', LocalDate.of(2016,1,17),'A',"A101");
        President president= new President("goker",'m',LocalDate.of(1989,10,26),LocalDate.of(2019,10,26));
    Teacher teacher=new Teacher("emily",'f',LocalDate.of(1990,2,2),"math teacher","A101",80000);


        System.out.println(student);
        System.out.println(teacher);
        System.out.println(president);

        student.study();
        president.lie();
        teacher.teach();

        System.out.println("---------------------------------");

        student.eat("bakalava");
        teacher.eat("kebab");
        president.eat("donut");


        student.drink("milk");
        teacher.drink("tea");
        president.drink("water");

    }
}
