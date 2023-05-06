package day26_statics.studentTask;

import java.util.Arrays;

public class TestObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Yusuf", 21, 'M', "A16");

        Student student2 = new Student("Glenio", 24, 'M', "B34");
        Student student3 = new Student("Sumeyye", 22, 'F', "C56");
        Student student4 = new Student("Mehmet", 25, 'M', "D43");
        Student student5 = new Student("Sebastian", 23, 'M', "E27");

        Student student6 = new Student("Seb", 32, 'M', "E28");
        Student student7 = new Student("Goker", 33, 'M', "E62");
        Student student8 = new Student("Gorkem", 22, 'M', "E12");
        Student student9 = new Student("Roni", 7, 'M', "E72");
        Student student10 = new Student("Oznur", 55, 'F', "E47");
        Student student11 = new Student("Gokce", 32, 'F', "E37");



        Student[] students={student2,student3,student4,student5};
        Student[] students2={student6,student7};
        Student[] students3={student8,student9};
        Student[] students4={student10,student11};

        StudentsGroup group1 =new StudentsGroup("Java Turtles",1);
        StudentsGroup group2 =new StudentsGroup("Black Eagles",2);
        StudentsGroup group3= new StudentsGroup("Besiktas",3);
        StudentsGroup group4=new StudentsGroup("Dersim",4);

        group1.addStudent(student1);
        group1.addStudents(students);
        group2.addStudents(students2);
        group3.addStudents(students3);
        group4.addStudents(students4);

        group1.addStudent("Khashavar",34,'M',"F35");

        System.out.println(group1);

        group1.removeStudents("D43");

        group1.removeStudents("E27");

        System.out.println(group1);

        for (Student each : group1.students) {
            System.out.println(each.name+" : "+each.id);

        }

        System.out.println("-----------------------------------------------");




        StudentsGroup[] groups ={group1,group2,group3,group4};


/*
        for (Student each : group2.students) {
            System.out.println(each.name+" : "+each.id);

        }
        for (Student each : group3.students) {
            System.out.println(each.name+" : "+each.id);

        }
        for (Student each : group4.students) {
            System.out.println(each.name+" : "+each.id);

        }
        for (Student each : group1.students) {
            System.out.println(each.name+" : "+each.id);

        }


 */










        for (StudentsGroup each1 : groups) {

            System.out.println(each1.groupName+" : "+each1.groupId);

            for (Student student : each1.students) {
                System.out.println(student.name+" : "+student.id);
            }



        }











    }
}
/*
3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentsGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list

 */