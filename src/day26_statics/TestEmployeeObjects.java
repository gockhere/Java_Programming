package day26_statics;

public class TestEmployeeObjects {

    public static void main(String[] args) {
        Employee emp1= new Employee("Goker",'M',"SDET",135000);
        System.out.println(emp1);


        Employee emp2 =new Employee("Goker",'M');
        System.out.println(emp2);
    }
}
