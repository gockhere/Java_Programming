package day23_arrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();

        names.add("vasly");//
        names.add("vasly");//1
        names.add("ali");  //2
        names.add("sumeye");//3
        names.add("sumeye");//4
        names.add("sumeye");//5
        names.add("shukir");
        names.add("marika");
        names.add("marika");


        for (String each : names) {

            if (names.indexOf(each)==names.lastIndexOf(each)){
                System.out.println(each);

              
            }

        }

        System.out.println("=--=--=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-");


        ArrayList<String> name1 =new ArrayList<>();

        name1.add("vasly");//
        name1.add("vasly");//1
        name1.add("ali");  //2
        name1.add("sumeye");//3
        name1.add("sumeye");//4
        name1.add("sumeye");//5
        
        boolean hasMuhtar = name1.contains("muhtar");//false
        boolean hasAli = name1.contains("ali");//true


        System.out.println("hasAli = " + hasAli);
        System.out.println("hasMuhtar = " + hasMuhtar);
        








    }
}
