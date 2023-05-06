package day07_ifStatements;

public class IfStatementsWithoutCurlyBraces {

    public static void main(String[] args) {

        int age =32;

        if (age>=21){
            System.out.println("eligible");
        }else {
            System.out.println("not eligible");
        }

        System.out.println("-----------------------------------------");

        if (age >= 21) System.out.println("eligible");
        else System.out.println("not eligible");

        System.out.println("-----------------------------------------");
        int itemNum = 1;
        if (itemNum== 1  )
            System.out.println("eggs");

        else if (itemNum==2) {
            System.out.println("milk");
            System.out.println("Onion");

        }else
            System.out.println("apple");


        System.out.println("-----------------------------------------");

        int day = 2;

        if (day == 1 ) System.out.println("monday");
        else if (day== 2 ) System.out.println("tuesday");
        else if (day== 3 ) System.out.println("wednesday");
        else if (day== 4 ) System.out.println("thursday");
        else if (day== 5 ) System.out.println("friday");
        else if (day== 6 ) System.out.println("saturday");
        else System.out.println("sunday");

        //IF STATEMENT WITHOUT THE CURLY BRACES IS NOT A GOOD PRACTICE


    }
}
