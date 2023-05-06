package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {

        String [] group1={"james","daniel","mike","john"};
        String [] group2={"ali","can"};
        String [] group3={"veli","deli","nabi","ela","aze"};
        String [] group4={"roni","goker"};

        String[][]  groups={group1,group2,group3,group4};

        for (int i = 0; i < groups.length; i++) {

         String [] eachGroup=groups[i];

            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent =eachGroup[j];
                System.out.println(eachStudent);

            }






        }


        System.out.println("---------------------------------------------------------");


        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);


            }

        }

        System.out.println("---------------------------------------------------------");


        for (int i = groups.length - 1; i >= 0; i--) {
            String [] eachGroup=groups[i];
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);

            }

        }

        System.out.println("-------------------------------------------------");


        System.out.println(Arrays.deepToString(groups));




    }
}
