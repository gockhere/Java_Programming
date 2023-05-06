package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();


        list.add(10);  //0
        list.add(20);  //1
        list.add(30);  //2
        list.add(10);  //3
        //list.add(5.5); not integer

        System.out.println(list);

        list.add(1,15); //new index 1 is 15

        System.out.println(list);

        list.add(2,25); // new index 2 is 25

        System.out.println(list);


        System.out.println("----------------------------------------------------------");

        ArrayList<String> studentList= new ArrayList<>();

        studentList.add("goker");
        studentList.add("gokce");
        studentList.add("roni");
        studentList.add("gorkem");

        System.out.println(studentList.size());

        System.out.println(studentList);


        String firstStudent =studentList.get(0);

        System.out.println(firstStudent);



        String lastStudent = studentList.get(studentList.size()-1);

        System.out.println(lastStudent);













    }
}
