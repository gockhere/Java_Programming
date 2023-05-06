package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);


        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(1,numbers);

        System.out.println(list1);

        System.out.println("=================================================================");



        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(75,85,95,70,80));

        System.out.println(scores);

        System.out.println("===================================================");


        ArrayList<String> students= new ArrayList<>();

        students.addAll(Arrays.asList("kadir","hasan","GOKER","Roni") );

        System.out.println(students);

        students.addAll(2,  Arrays.asList("gokce","oznur","jim") );

        System.out.println(students);

        System.out.println("------------------------------");

        Integer[] nums ={1,2,3,4,5,6,7,8};

        ArrayList<Integer>l1 = new ArrayList<>( Arrays.asList(nums)  );



      //  l1.addAll(Arrays.asList(nums));

        System.out.println(l1);

        System.out.println("==============================================");



        ArrayList<String> employeeList = new ArrayList<>();

        employeeList.addAll(Arrays.asList("aleyna","muhtar","kadir", "goker"));

        System.out.println(employeeList);


        boolean hasAleyna= employeeList.contains("aleyna");


        boolean hasAleynaKadir= employeeList.containsAll(Arrays.asList("aleyna","kadir"));

        boolean hasMuhtarAliKuzat =employeeList.containsAll(Arrays.asList("muhtar","kuzat","ali"));

        System.out.println("hasAleyna = " + hasAleyna);

        System.out.println("hasAleynaKadir = " + hasAleynaKadir);


        System.out.println("hasMuhtarAliKuzat = " + hasMuhtarAliKuzat);


        System.out.println("-----------------------------------------------------");


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(  Arrays.asList(10,10,20,30,40,50,60,70,10,10,10,10,10,20,20));

        list.removeAll(Arrays.asList(10,20));

        System.out.println(list);


        System.out.println("--------------------------------------------------");



        ArrayList<String> developers = new ArrayList<>();

        developers.addAll(Arrays.asList("aleyna","muhtar","kadir", "goker","ali","muhtar","kadir","goker"));

        developers.retainAll(Arrays.asList("aleyna","kadir","goker"));

        System.out.println(developers);


        System.out.println("----------------------------------------------");


        ArrayList<String> groceryList = new ArrayList<>();

        groceryList.addAll(Arrays.asList("eggs","potato","milk","tomato","rice","orange","strawberry","paper towels"));

       // groceryList.retainAll(Arrays.asList("eggs","potato","milk","tomato"));

        groceryList.removeAll(Arrays.asList("rice","orange","strawberry","paper towels"));



        System.out.println(groceryList);





















    }
}
