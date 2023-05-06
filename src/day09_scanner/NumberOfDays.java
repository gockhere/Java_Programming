package day09_scanner;

public class NumberOfDays  {

    public static void main(String[] args) {
        int month =15;
         String result = "";

         switch (month){

             case 2:
                 result = "28 days";
                 break;


             case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                 result = "31 days";
                 break;

             case 4:
             case 6:
             case 9:
             case 11:
             result= "30 days";
                break;
             default:result="invalid";



         }
        System.out.println(result);






          /*
        1. Create a class named NumberOfDays.java
2. An integer variable named month is declared and given, Write a
program that can print the number of days in the given month
Ex:
Given:
number = 1
output:
31 days
Hints:
Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
Months that has 30 days are: 4, 6, 9, 11
Month that has 28 days: 2
         */
    }
}
