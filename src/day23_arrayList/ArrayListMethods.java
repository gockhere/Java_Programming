package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {


        int [] array ={1,2,3,4,5};

        array[0]=100;

        System.out.println(Arrays.toString(array));

        ArrayList<String>groceryList= new ArrayList<>();

        groceryList.add("eggs");
        groceryList.add("paper towels");
        groceryList.add("Apples");
        groceryList.add("cooking oil ");

        System.out.println(groceryList);

       // groceryList[2]="oranges";

        groceryList.set(2, "oranges"); // apples changes to orange

        System.out.println(groceryList);

        groceryList.add(2,"chicken");

        System.out.println(groceryList);

        groceryList.remove(0); // removes index 0

        System.out.println(groceryList);

        groceryList.remove("paper towels");

        System.out.println(groceryList);

        System.out.println("-----------------------------------------");

        ArrayList<Integer>numbers=new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        boolean r1 =numbers.remove(Integer.valueOf(20));

        System.out.println(numbers);

        System.out.println(r1);

        numbers.clear();

        System.out.println(numbers);

        System.out.println("-------------------------------------------------------");


        ArrayList<String>names=new ArrayList<>();

        names.add("vasly");//
        names.add("vasly");//1
        names.add("ali");  //2
        names.add("sumeye");//3
        names.add("sumeye");//4
        names.add("sumeye");//5

        System.out.println(names.indexOf("vasly")); //0
        System.out.println(names.lastIndexOf("vasly"));//1

        System.out.println(names.lastIndexOf("sumeye"));//5













    }
}
