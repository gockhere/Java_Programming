package day06_ifStatements;

public class IdentifyNumber {
    public static void main(String[] args) {

int number = 100;
boolean isPositive =number>0 ;
boolean isNegative =number <0;
//boolean isZero =number==0;
boolean isZero = !isPositive && !isNegative ; // if the number not negative not positive then its zero

        System.out.println(number+ " is positive number:"+ isPositive);
        System.out.println(number+ " is negative number:"+ isNegative);
        System.out.println(number +  " is zero :" + isZero);






/*
2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */





    }
}
