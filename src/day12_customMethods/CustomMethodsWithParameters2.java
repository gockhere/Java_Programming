package day12_customMethods;

public class CustomMethodsWithParameters2 {
    public static void main(String[] args) {

        oddOrEven(0);

     eligible(17);

     score(62);

    }



    public static void eligible(int age){

        if (age >=21&&age<=100){
            System.out.println("eligible to buy alcohol");
        }else {
            System.out.println("not eligible");
        }
    }

    public static void oddOrEven(int number){

        if (number%2==0){
            System.out.println(number+" is even");
        } else if (number==0)
        {
            System.out.println(number+"is zero");
        }else {
            System.out.println(number+"is odd");
        }

    }

    public static void score(int grade){

        if (grade==100&&grade>=90){
            System.out.println("students gets A");
        } else if (grade>=70&&grade<90) {
            System.out.println("students gets B");

        } else if (grade>=60&&grade<70) {
            System.out.println("students gets C");

        } else if (grade>=50&&grade<60) {
            System.out.println("students gets D");

        } else if (grade<50&&grade>=0) {
            System.out.println("students gets F");

        }else {
            System.out.println("not eligible grade");
        }


    }












}
