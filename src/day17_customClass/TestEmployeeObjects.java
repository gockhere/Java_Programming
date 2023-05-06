package day17_customClass;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Employee employee1= new Employee();
        employee1.setInfo("Sumeye",33,'F',"Java Devoloper",95000,"A12");

        Employee employee2= new Employee();
        employee2.setInfo("goker",33,'M',"Tester",132000,"B13");

        Employee employee3= new Employee();
        employee3.setInfo("Roni", 7,'M',"Engineer",500000,"C33");

        System.out.println(employee1);
        System.out.println(employee3);
        System.out.println(employee2);


        employee1.work();



    }
}
