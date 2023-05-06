package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();

        names.add("vasly");//
        names.add("vasly");//1
        names.add("ali");  //2
        names.add("sumeye");//3
        names.add("sumeye");//4
        names.add("sumeye");//5


        System.out.println(names);

        ArrayList<String> nonDup = new ArrayList<>();

        for (String each : names) {

            if (nonDup.contains(each)){
                continue;
            }

            nonDup.add(each);

        }

        names=nonDup;

        System.out.println(names);

        System.out.println(nonDup);

        System.out.println("-------------------------------------------");


        ArrayList<Integer>list1= new ArrayList<>();

        ArrayList<Integer> list2 =list1;

        list1.add(10);

        System.out.println(list2);
        System.out.println(list1);

        System.out.println(list1==list2);

        ArrayList<Integer> l1= new ArrayList<>();

        ArrayList<Integer> l2 =new ArrayList<>();

        l1.add(10);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1==l2);

        System.out.println(l1.equals(l2));

        ArrayList<Integer> n1= new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2= new ArrayList<>();
        n1.add(30);
        n1.add(10);
        n1.add(20);

        System.out.println("n2 = " + n2);
        System.out.println("n1 = " + n1);

        System.out.println(n1==n2); //false

        System.out.println("---------------------------------------");

        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());

        n1.clear();
        n2.clear();

        System.out.println("-------------------------------------------------");

        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());



















    }
}
